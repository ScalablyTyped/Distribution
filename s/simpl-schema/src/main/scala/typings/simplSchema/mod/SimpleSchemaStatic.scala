package typings.simplSchema.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.simplSchema.anon.BADDATE
import typings.simplSchema.anon.Domain
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.NumberConstructor
import typings.std.RegExp
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleSchemaStatic
  extends Instantiable1[/* schema */ SimpleSchemaDefinition, SimpleSchema]
     with Instantiable2[/* schema */ SimpleSchemaDefinition, /* options */ SimpleSchemaOptions, SimpleSchema] {
  var ErrorTypes: BADDATE = js.native
  var Integer: RegExp = js.native
  var RegEx: Domain = js.native
  def addValidator(validator: js.Function0[Boolean]): js.Any = js.native
  def allowsKey(key: js.Any): String = js.native
  def clean(doc: js.Any): js.Any = js.native
  def clean(doc: js.Any, options: CleanOption): js.Any = js.native
  def extend(otherSchema: SimpleSchemaStatic): SimpleSchemaStatic = js.native
  def extendOptions(options: js.Array[String]): Unit = js.native
  def getDefinition(key: String): js.Any = js.native
  def getDefinition(key: String, propList: js.Any): js.Any = js.native
  def getDefinition(key: String, propList: js.Any, functionContext: js.Any): js.Any = js.native
  def keyIsInBlackBox(key: String): Boolean = js.native
  def label(key: js.Any): js.Any = js.native
  def labels(labels: StringDictionary[String]): Unit = js.native
  def messageForError(`type`: js.Any, key: js.Any, `def`: js.Any, value: js.Any): String = js.native
  def messages(messages: js.Any): js.Any = js.native
  def namedContext(): SimpleSchemaValidationContextStatic = js.native
  def namedContext(name: String): SimpleSchemaValidationContextStatic = js.native
  def newContext(): ValidationContext = js.native
  def objectKeys(keyPrefix: js.Any): js.Array[_] = js.native
  def omit(fields: String*): SimpleSchemaStatic = js.native
  def oneOf(
    types: (SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor)*
  ): SimpleSchemaStatic = js.native
  def pick(fields: String*): SimpleSchemaStatic = js.native
  def schema(): js.Array[SchemaDefinition] = js.native
  def schema(key: String): SchemaDefinition = js.native
  def validate(obj: js.Any): Unit = js.native
  def validate(obj: js.Any, options: ValidationOption): Unit = js.native
  def validator(): js.Function1[/* obj */ js.Any, Boolean] = js.native
  def validator(options: ValidationOption): js.Function1[/* obj */ js.Any, Boolean] = js.native
}

