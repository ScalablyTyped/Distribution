package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.distComponentsTypesObjectMod.ObjectTypeProps
import typings.storybookAddonKnobs.distComponentsTypesObjectMod.ObjectTypeState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofObjectType extends StObject {
  
  /* static member */
  var defaultProps: ObjectTypeProps[Any]
  
  /* static member */
  var deserialize: js.Function1[/* value */ String, Any]
  
  /* static member */
  def getDerivedStateFromProps[T](props: ObjectTypeProps[T], state: ObjectTypeState[T]): ObjectTypeState[T] | Null
  
  /* static member */
  var propTypes: OnChangeValidator
  
  /* static member */
  var serialize: js.Function1[/* object */ Any, String]
}
object TypeofObjectType {
  
  inline def apply(
    defaultProps: ObjectTypeProps[Any],
    deserialize: /* value */ String => Any,
    getDerivedStateFromProps: (ObjectTypeProps[Any], ObjectTypeState[Any]) => ObjectTypeState[Any] | Null,
    propTypes: OnChangeValidator,
    serialize: /* object */ Any => String
  ): TypeofObjectType = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], deserialize = js.Any.fromFunction1(deserialize), getDerivedStateFromProps = js.Any.fromFunction2(getDerivedStateFromProps), propTypes = propTypes.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[TypeofObjectType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofObjectType] (val x: Self) extends AnyVal {
    
    inline def setDefaultProps(value: ObjectTypeProps[Any]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDeserialize(value: /* value */ String => Any): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    inline def setGetDerivedStateFromProps(value: (ObjectTypeProps[Any], ObjectTypeState[Any]) => ObjectTypeState[Any] | Null): Self = StObject.set(x, "getDerivedStateFromProps", js.Any.fromFunction2(value))
    
    inline def setPropTypes(value: OnChangeValidator): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: /* object */ Any => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
