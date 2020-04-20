package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules[P /* <: js.Object */] extends js.Object {
  var description: js.UndefOr[String | (js.Function1[/* params */ P, String])] = js.undefined
  var name: String
  var params: js.UndefOr[
    ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof P ]: react-native-joi.react-native-joi.SchemaLike}
    */ typings.reactNativeJoi.reactNativeJoiStrings.Rules with TopLevel[js.Any])
  ] = js.undefined
  var setup: js.UndefOr[js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit]] = js.undefined
  var validate: js.UndefOr[
    js.ThisFunction4[
      /* this */ ExtensionBoundSchema, 
      /* params */ P, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.undefined
}

object Rules {
  @scala.inline
  def apply[P /* <: js.Object */](
    name: String,
    description: String | (js.Function1[/* params */ P, String]) = null,
    params: ObjectSchema | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof P ]: react-native-joi.react-native-joi.SchemaLike}
    */ typings.reactNativeJoi.reactNativeJoiStrings.Rules with TopLevel[js.Any]) = null,
    setup: js.ThisFunction1[/* this */ ExtensionBoundSchema, /* params */ P, Schema | Unit] = null,
    validate: js.ThisFunction4[
      /* this */ ExtensionBoundSchema, 
      /* params */ P, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ] = null
  ): Rules[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules[P]]
  }
}

