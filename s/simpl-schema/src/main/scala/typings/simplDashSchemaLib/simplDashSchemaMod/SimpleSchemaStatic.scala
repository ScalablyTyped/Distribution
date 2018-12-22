package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleSchemaStatic
  extends org.scalablytyped.runtime.Instantiable2[
      (/* schema */ js.Array[js.Any]) | (/* schema */ org.scalablytyped.runtime.StringDictionary[
        SchemaDefinition | stdLib.BooleanConstructor | stdLib.StringConstructor | stdLib.NumberConstructor | stdLib.DateConstructor | stdLib.ArrayConstructor | java.lang.String | stdLib.RegExp | SimpleSchema
      ]), 
      /* options */ SimpleSchemaOptions, 
      SimpleSchema
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* schema */ js.Array[js.Any]) | (/* schema */ org.scalablytyped.runtime.StringDictionary[
        SchemaDefinition | stdLib.BooleanConstructor | stdLib.StringConstructor | stdLib.NumberConstructor | stdLib.DateConstructor | stdLib.ArrayConstructor | java.lang.String | stdLib.RegExp | SimpleSchema
      ]), 
      SimpleSchema
    ] {
  var ErrorTypes: simplDashSchemaLib.Anon_BADDATE = js.native
  var Integer: stdLib.RegExp = js.native
  var RegEx: simplDashSchemaLib.Anon_Id = js.native
  def addValidator(validator: js.Function0[scala.Boolean]): js.Any = js.native
  def allowsKey(key: js.Any): java.lang.String = js.native
  def clean(doc: js.Any): js.Any = js.native
  def clean(doc: js.Any, options: CleanOption): js.Any = js.native
  def getDefinition(key: java.lang.String): js.Any = js.native
  def getDefinition(key: java.lang.String, propList: js.Any): js.Any = js.native
  def getDefinition(key: java.lang.String, propList: js.Any, functionContext: js.Any): js.Any = js.native
  def keyIsInBlackBox(key: java.lang.String): scala.Boolean = js.native
  def label(key: js.Any): js.Any = js.native
  def labels(labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  def messageForError(`type`: js.Any, key: js.Any, `def`: js.Any, value: js.Any): java.lang.String = js.native
  def messages(messages: js.Any): js.Any = js.native
  def namedContext(): SimpleSchemaValidationContextStatic = js.native
  def namedContext(name: java.lang.String): SimpleSchemaValidationContextStatic = js.native
  def newContext(): ValidationContext = js.native
  def objectKeys(keyPrefix: js.Any): js.Array[_] = js.native
  def omit(fields: java.lang.String*): SimpleSchemaStatic = js.native
  def pick(fields: java.lang.String*): SimpleSchemaStatic = js.native
  def schema(): SchemaDefinition | js.Array[SchemaDefinition] = js.native
  def schema(key: java.lang.String): SchemaDefinition | js.Array[SchemaDefinition] = js.native
  def validate(obj: js.Any): scala.Unit = js.native
  def validate(obj: js.Any, options: ValidationOption): scala.Unit = js.native
  def validator(options: ValidationOption): js.Function0[scala.Boolean] = js.native
}

