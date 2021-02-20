package typings.reactOverlays

import typings.reactOverlays.anon.PartialModifieranyany
import typings.reactOverlays.usePopperMod.Modifiers
import typings.reactOverlays.usePopperMod.Offset
import typings.reactOverlays.usePopperMod.OffsetValue
import typings.reactOverlays.usePopperMod.Placement
import typings.reactOverlays.usePopperMod.UsePopperOptions
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeOptionsWithPopperConfigMod {
  
  @JSImport("react-overlays/cjs/mergeOptionsWithPopperConfig", JSImport.Default)
  @js.native
  def default(hasEnabledEnableEventsPlacementFlipOffsetContainerPaddingArrowElementPopperConfig: Config): UsePopperOptions = js.native
  
  @JSImport("react-overlays/cjs/mergeOptionsWithPopperConfig", "toModifierArray")
  @js.native
  def toModifierArray(): js.Array[PartialModifieranyany] = js.native
  @JSImport("react-overlays/cjs/mergeOptionsWithPopperConfig", "toModifierArray")
  @js.native
  def toModifierArray(map: Modifiers): js.Array[PartialModifieranyany] = js.native
  
  @JSImport("react-overlays/cjs/mergeOptionsWithPopperConfig", "toModifierMap")
  @js.native
  def toModifierMap(): Record[String, PartialModifieranyany] = js.native
  @JSImport("react-overlays/cjs/mergeOptionsWithPopperConfig", "toModifierMap")
  @js.native
  def toModifierMap(modifiers: Modifiers): Record[String, PartialModifieranyany] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.native
    
    var arrowElement: js.UndefOr[Element | Null] = js.native
    
    var containerPadding: js.UndefOr[Double] = js.native
    
    var enableEvents: js.UndefOr[Boolean] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var flip: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Offset] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var popperConfig: js.UndefOr[UsePopperOptions] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
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
      def setOffsetFunction1(value: /* details */ typings.reactOverlays.anon.Placement => OffsetValue): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
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
