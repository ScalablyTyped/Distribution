package typings.reactSpringCore.anon

import typings.reactSpringCore.distDeclarationsSrcControllerMod.Controller
import typings.reactSpringCore.distDeclarationsSrcSpringValueMod.SpringValue
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.AnimationResult
import typings.reactSpringTypes.utilMod.Lookup
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange[State /* <: Lookup[Any] */] extends StObject {
  
  var onChange: Map[
    js.Function3[
      /* result */ AnimationResult[SpringValue[State]], 
      /* ctrl */ Controller[State], 
      js.UndefOr[Any], 
      Unit
    ], 
    AnimationResult[Any]
  ]
  
  var onRest: Map[
    js.Function3[
      /* result */ AnimationResult[SpringValue[State]], 
      /* ctrl */ Controller[State], 
      js.UndefOr[Any], 
      Unit
    ], 
    AnimationResult[Any]
  ]
  
  var onStart: Map[
    js.Function3[
      /* result */ AnimationResult[SpringValue[State]], 
      /* ctrl */ Controller[State], 
      js.UndefOr[Any], 
      Unit
    ], 
    AnimationResult[Any]
  ]
}
object OnChange {
  
  inline def apply[State /* <: Lookup[Any] */](
    onChange: Map[
      js.Function3[
        /* result */ AnimationResult[SpringValue[State]], 
        /* ctrl */ Controller[State], 
        js.UndefOr[Any], 
        Unit
      ], 
      AnimationResult[Any]
    ],
    onRest: Map[
      js.Function3[
        /* result */ AnimationResult[SpringValue[State]], 
        /* ctrl */ Controller[State], 
        js.UndefOr[Any], 
        Unit
      ], 
      AnimationResult[Any]
    ],
    onStart: Map[
      js.Function3[
        /* result */ AnimationResult[SpringValue[State]], 
        /* ctrl */ Controller[State], 
        js.UndefOr[Any], 
        Unit
      ], 
      AnimationResult[Any]
    ]
  ): OnChange[State] = {
    val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any], onRest = onRest.asInstanceOf[js.Any], onStart = onStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange[State]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnChange[?], State /* <: Lookup[Any] */] (val x: Self & OnChange[State]) extends AnyVal {
    
    inline def setOnChange(
      value: Map[
          js.Function3[
            /* result */ AnimationResult[SpringValue[State]], 
            /* ctrl */ Controller[State], 
            js.UndefOr[Any], 
            Unit
          ], 
          AnimationResult[Any]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnRest(
      value: Map[
          js.Function3[
            /* result */ AnimationResult[SpringValue[State]], 
            /* ctrl */ Controller[State], 
            js.UndefOr[Any], 
            Unit
          ], 
          AnimationResult[Any]
        ]
    ): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
    
    inline def setOnStart(
      value: Map[
          js.Function3[
            /* result */ AnimationResult[SpringValue[State]], 
            /* ctrl */ Controller[State], 
            js.UndefOr[Any], 
            Unit
          ], 
          AnimationResult[Any]
        ]
    ): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
  }
}
