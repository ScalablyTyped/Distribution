package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "ORM")
@js.native
class ORM[State /* <: ORMCommonState */] () extends js.Object {
  def this(opts: ORMOpts) = this()
  /* private */ def _attachQuerySetMethods(
    model: org.scalablytyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]]
  ): scala.Unit = js.native
  /* private */ def _setupModelPrototypes(
    models: js.Array[
      org.scalablytyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]]
    ]
  ): scala.Unit = js.native
  def generateSchemaSpec(): SchemaSpec = js.native
  def get(modelName: java.lang.String): org.scalablytyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]] = js.native
  def getDatabase(): DB = js.native
  def getEmptyState(): State = js.native
  def getModelClasses(): js.Array[
    org.scalablytyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]]
  ] = js.native
  def isFieldInstalled(modelName: java.lang.String, fieldName: java.lang.String): scala.Boolean = js.native
  def mutableSession(state: State): SessionWithModels[State] = js.native
  def register(
    model: (org.scalablytyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]])*
  ): scala.Unit = js.native
  def registerManyToManyModelsFor(
    model: org.scalablytyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]]
  ): scala.Unit = js.native
  @JSName("register")
  def register_M[M](model: (/* import warning: ImportType.apply Failed type conversion: M[keyof M] */ js.Any)*): scala.Unit = js.native
  def session(state: State): SessionWithModels[State] = js.native
  def setFieldInstalled(modelName: java.lang.String, fieldName: java.lang.String): scala.Unit = js.native
}

