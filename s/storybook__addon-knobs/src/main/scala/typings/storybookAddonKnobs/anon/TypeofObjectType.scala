package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.objectMod.ObjectTypeProps
import typings.storybookAddonKnobs.objectMod.ObjectTypeState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofObjectType extends StObject {
  
  /* static member */
  var defaultProps: ObjectTypeProps[_] = js.native
  
  /* static member */
  var deserialize: js.Function1[/* value */ String, _] = js.native
  
  /* static member */
  def getDerivedStateFromProps[T](props: ObjectTypeProps[T], state: ObjectTypeState[T]): ObjectTypeState[T] | Null = js.native
  
  /* static member */
  var propTypes: OnChangeValidator = js.native
  
  /* static member */
  var serialize: js.Function1[/* object */ js.Any, String] = js.native
}
object TypeofObjectType {
  
  @scala.inline
  def apply(
    defaultProps: ObjectTypeProps[_],
    deserialize: /* value */ String => _,
    getDerivedStateFromProps: (ObjectTypeProps[js.Any], ObjectTypeState[js.Any]) => ObjectTypeState[js.Any] | Null,
    propTypes: OnChangeValidator,
    serialize: /* object */ js.Any => String
  ): TypeofObjectType = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], deserialize = js.Any.fromFunction1(deserialize), getDerivedStateFromProps = js.Any.fromFunction2(getDerivedStateFromProps), propTypes = propTypes.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[TypeofObjectType]
  }
  
  @scala.inline
  implicit class TypeofObjectTypeMutableBuilder[Self <: TypeofObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: ObjectTypeProps[_]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeserialize(value: /* value */ String => _): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDerivedStateFromProps(value: (ObjectTypeProps[js.Any], ObjectTypeState[js.Any]) => ObjectTypeState[js.Any] | Null): Self = StObject.set(x, "getDerivedStateFromProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPropTypes(value: OnChangeValidator): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialize(value: /* object */ js.Any => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
