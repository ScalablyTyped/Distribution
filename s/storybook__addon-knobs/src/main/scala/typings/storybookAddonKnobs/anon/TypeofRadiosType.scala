package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.radioMod.RadiosTypeKnobValue
import typings.storybookAddonKnobs.radioMod.RadiosTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRadiosType extends StObject {
  
  /* static member */
  var defaultProps: RadiosTypeProps
  
  /* static member */
  var deserialize: js.Function1[/* value */ RadiosTypeKnobValue, js.UndefOr[String | Double | Null]]
  
  /* static member */
  var propTypes: IsInlineKnob
  
  /* static member */
  var serialize: js.Function1[/* value */ RadiosTypeKnobValue, js.UndefOr[String | Double | Null]]
}
object TypeofRadiosType {
  
  inline def apply(
    defaultProps: RadiosTypeProps,
    deserialize: /* value */ RadiosTypeKnobValue => js.UndefOr[String | Double | Null],
    propTypes: IsInlineKnob,
    serialize: /* value */ RadiosTypeKnobValue => js.UndefOr[String | Double | Null]
  ): TypeofRadiosType = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], deserialize = js.Any.fromFunction1(deserialize), propTypes = propTypes.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[TypeofRadiosType]
  }
  
  extension [Self <: TypeofRadiosType](x: Self) {
    
    inline def setDefaultProps(value: RadiosTypeProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDeserialize(value: /* value */ RadiosTypeKnobValue => js.UndefOr[String | Double | Null]): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    inline def setPropTypes(value: IsInlineKnob): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: /* value */ RadiosTypeKnobValue => js.UndefOr[String | Double | Null]): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
