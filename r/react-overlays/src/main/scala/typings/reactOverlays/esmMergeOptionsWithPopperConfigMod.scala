package typings.reactOverlays

import typings.reactOverlays.anon.PartialModifieranyany
import typings.reactOverlays.anon.Popper
import typings.reactOverlays.esmUsePopperMod.Modifiers
import typings.reactOverlays.esmUsePopperMod.Offset
import typings.reactOverlays.esmUsePopperMod.OffsetValue
import typings.reactOverlays.esmUsePopperMod.Placement
import typings.reactOverlays.esmUsePopperMod.UsePopperOptions
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMergeOptionsWithPopperConfigMod {
  
  @JSImport("react-overlays/esm/mergeOptionsWithPopperConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasEnabledEnableEventsPlacementFlipOffsetContainerPaddingArrowElementPopperConfig: Config): UsePopperOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasEnabledEnableEventsPlacementFlipOffsetContainerPaddingArrowElementPopperConfig.asInstanceOf[js.Any]).asInstanceOf[UsePopperOptions]
  
  @scala.inline
  def toModifierArray(): js.Array[PartialModifieranyany] = ^.asInstanceOf[js.Dynamic].applyDynamic("toModifierArray")().asInstanceOf[js.Array[PartialModifieranyany]]
  @scala.inline
  def toModifierArray(map: Modifiers): js.Array[PartialModifieranyany] = ^.asInstanceOf[js.Dynamic].applyDynamic("toModifierArray")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[PartialModifieranyany]]
  
  @scala.inline
  def toModifierMap(): Record[String, PartialModifieranyany] = ^.asInstanceOf[js.Dynamic].applyDynamic("toModifierMap")().asInstanceOf[Record[String, PartialModifieranyany]]
  @scala.inline
  def toModifierMap(modifiers: Modifiers): Record[String, PartialModifieranyany] = ^.asInstanceOf[js.Dynamic].applyDynamic("toModifierMap")(modifiers.asInstanceOf[js.Any]).asInstanceOf[Record[String, PartialModifieranyany]]
  
  trait Config extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.undefined
    
    var arrowElement: js.UndefOr[Element | Null] = js.undefined
    
    var containerPadding: js.UndefOr[Double] = js.undefined
    
    var enableEvents: js.UndefOr[Boolean] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Offset] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var popperConfig: js.UndefOr[UsePopperOptions] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignEnd(value: Boolean): Self = StObject.set(x, "alignEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignEndUndefined: Self = StObject.set(x, "alignEnd", js.undefined)
      
      @scala.inline
      def setArrowElement(value: Element): Self = StObject.set(x, "arrowElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowElementNull: Self = StObject.set(x, "arrowElement", null)
      
      @scala.inline
      def setArrowElementUndefined: Self = StObject.set(x, "arrowElement", js.undefined)
      
      @scala.inline
      def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      @scala.inline
      def setEnableEvents(value: Boolean): Self = StObject.set(x, "enableEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableEventsUndefined: Self = StObject.set(x, "enableEvents", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFunction1(value: /* details */ Popper => OffsetValue): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopperConfig(value: UsePopperOptions): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
}
