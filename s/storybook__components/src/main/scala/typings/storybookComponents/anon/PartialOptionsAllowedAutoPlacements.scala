package typings.storybookComponents.anon

import typings.std.Element
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Boundary
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.RootBoundary
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/components.@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-modifiers-flip.Options> */
trait PartialOptionsAllowedAutoPlacements extends StObject {
  
  var allowedAutoPlacements: js.UndefOr[
    js.Array[
      typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement
    ]
  ] = js.undefined
  
  var altAxis: js.UndefOr[Boolean] = js.undefined
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[Boundary] = js.undefined
  
  var fallbackPlacements: js.UndefOr[
    js.Array[
      typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement
    ]
  ] = js.undefined
  
  var flipVariations: js.UndefOr[Boolean] = js.undefined
  
  var mainAxis: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
}
object PartialOptionsAllowedAutoPlacements {
  
  inline def apply(): PartialOptionsAllowedAutoPlacements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAllowedAutoPlacements]
  }
  
  extension [Self <: PartialOptionsAllowedAutoPlacements](x: Self) {
    
    inline def setAllowedAutoPlacements(
      value: js.Array[
          typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement
        ]
    ): Self = StObject.set(x, "allowedAutoPlacements", value.asInstanceOf[js.Any])
    
    inline def setAllowedAutoPlacementsUndefined: Self = StObject.set(x, "allowedAutoPlacements", js.undefined)
    
    inline def setAllowedAutoPlacementsVarargs(value: typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement*): Self = StObject.set(x, "allowedAutoPlacements", js.Array(value*))
    
    inline def setAltAxis(value: Boolean): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
    
    inline def setAltAxisUndefined: Self = StObject.set(x, "altAxis", js.undefined)
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setBoundaryVarargs(value: Element*): Self = StObject.set(x, "boundary", js.Array(value*))
    
    inline def setFallbackPlacements(
      value: js.Array[
          typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement
        ]
    ): Self = StObject.set(x, "fallbackPlacements", value.asInstanceOf[js.Any])
    
    inline def setFallbackPlacementsUndefined: Self = StObject.set(x, "fallbackPlacements", js.undefined)
    
    inline def setFallbackPlacementsVarargs(value: typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement*): Self = StObject.set(x, "fallbackPlacements", js.Array(value*))
    
    inline def setFlipVariations(value: Boolean): Self = StObject.set(x, "flipVariations", value.asInstanceOf[js.Any])
    
    inline def setFlipVariationsUndefined: Self = StObject.set(x, "flipVariations", js.undefined)
    
    inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}
