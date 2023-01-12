package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutAnimation extends StObject {
  
  var animations: AnimateStyle[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ Any
  ]
  
  var initialValues: StyleProps
}
object LayoutAnimation {
  
  inline def apply(
    animations: AnimateStyle[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ Any
    ],
    initialValues: StyleProps
  ): LayoutAnimation = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutAnimation] (val x: Self) extends AnyVal {
    
    inline def setAnimations(
      value: AnimateStyle[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ Any
        ]
    ): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setInitialValues(value: StyleProps): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
  }
}
