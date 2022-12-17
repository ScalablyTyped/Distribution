package typings.reactOverlays

import typings.reactOverlays.anon.PartialModifieranyany
import typings.reactOverlays.anon.PartialModifieranyanyData
import typings.reactOverlays.cjsUsePopperMod.Modifiers
import typings.reactOverlays.cjsUsePopperMod.Offset
import typings.reactOverlays.cjsUsePopperMod.OffsetValue
import typings.reactOverlays.cjsUsePopperMod.Placement
import typings.reactOverlays.cjsUsePopperMod.UsePopperOptions
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsMergeOptionsWithPopperConfigMod {
  
  @JSImport("react-overlays/cjs/mergeOptionsWithPopperConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Config): UsePopperOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[UsePopperOptions]
  
  inline def toModifierArray(): js.Array[PartialModifieranyanyData] = ^.asInstanceOf[js.Dynamic].applyDynamic("toModifierArray")().asInstanceOf[js.Array[PartialModifieranyanyData]]
  inline def toModifierArray(map: Modifiers): js.Array[PartialModifieranyanyData] = ^.asInstanceOf[js.Dynamic].applyDynamic("toModifierArray")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[PartialModifieranyanyData]]
  
  inline def toModifierMap(): Record[String, PartialModifieranyany] = ^.asInstanceOf[js.Dynamic].applyDynamic("toModifierMap")().asInstanceOf[Record[String, PartialModifieranyany]]
  inline def toModifierMap(modifiers: Modifiers): Record[String, PartialModifieranyany] = ^.asInstanceOf[js.Dynamic].applyDynamic("toModifierMap")(modifiers.asInstanceOf[js.Any]).asInstanceOf[Record[String, PartialModifieranyany]]
  
  trait Config extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.undefined
    
    var arrowElement: js.UndefOr[Element | Null] = js.undefined
    
    var containerPadding: js.UndefOr[Double] = js.undefined
    
    var enableEvents: js.UndefOr[Boolean] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Offset] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var popperConfig: js.UndefOr[UsePopperOptions] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAlignEnd(value: Boolean): Self = StObject.set(x, "alignEnd", value.asInstanceOf[js.Any])
      
      inline def setAlignEndUndefined: Self = StObject.set(x, "alignEnd", js.undefined)
      
      inline def setArrowElement(value: Element): Self = StObject.set(x, "arrowElement", value.asInstanceOf[js.Any])
      
      inline def setArrowElementNull: Self = StObject.set(x, "arrowElement", null)
      
      inline def setArrowElementUndefined: Self = StObject.set(x, "arrowElement", js.undefined)
      
      inline def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setEnableEvents(value: Boolean): Self = StObject.set(x, "enableEvents", value.asInstanceOf[js.Any])
      
      inline def setEnableEventsUndefined: Self = StObject.set(x, "enableEvents", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(value: /* details */ typings.reactOverlays.anon.Placement => OffsetValue): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperConfig(value: UsePopperOptions): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      inline def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
    }
  }
}
