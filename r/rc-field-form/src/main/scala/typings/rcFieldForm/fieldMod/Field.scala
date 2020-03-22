package typings.rcFieldForm.fieldMod

import org.scalablytyped.runtime.StringDictionary
import typings.rcFieldForm.AnonChild
import typings.rcFieldForm.AnonResetCount
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.InternalNamePath
import typings.rcFieldForm.interfaceMod.Meta
import typings.rcFieldForm.interfaceMod.NotifyInfo
import typings.rcFieldForm.interfaceMod.RuleObject
import typings.rcFieldForm.interfaceMod.Store
import typings.rcFieldForm.interfaceMod.ValidateOptions
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.rcFieldForm.interfaceMod.FieldEntity because var conflicts: props. Inlined onStoreChange, onStoreChange, isFieldTouched, isFieldValidating, validateRules, validateRules, getMeta, getNamePath, getErrors */ @js.native
trait Field
  extends Component[FieldProps, FieldState, js.Any] {
  var cancelRegisterFunc: js.Any = js.native
  var destroy: js.Any = js.native
  var errors: js.Any = js.native
  var onStoreChange: js.Function3[
    /* store */ Store, 
    /* namePathList */ js.Array[InternalNamePath] | Null, 
    /* info */ NotifyInfo, 
    Unit
  ] = js.native
  var prevValidating: js.Any = js.native
  @JSName("state")
  var state_Field: AnonResetCount = js.native
  /**
    * Follow state should not management in State since it will async update by React.
    * This makes first render of form can not get correct state value.
    */
  var touched: js.Any = js.native
  var validatePromise: js.Any = js.native
  def cancelRegister(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MField(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MField(): Unit = js.native
  def getControlled(): StringDictionary[js.Any] = js.native
  def getControlled(childProps: ChildProps): StringDictionary[js.Any] = js.native
  def getErrors(): js.Array[String] = js.native
  def getMeta(): Meta = js.native
  def getNamePath(): InternalNamePath = js.native
  def getOnlyChild(children: String): AnonChild = js.native
  def getOnlyChild(
    children: js.Function3[/* control */ ChildProps, /* meta */ Meta, /* context */ FormInstance, ReactNode]
  ): AnonChild = js.native
  def getOnlyChild(children: js.Object): AnonChild = js.native
  def getOnlyChild(children: Boolean): AnonChild = js.native
  def getOnlyChild(children: Double): AnonChild = js.native
  def getOnlyChild(children: ReactElement): AnonChild = js.native
  def getOnlyChild(children: ReactNodeArray): AnonChild = js.native
  def getOnlyChild(children: ReactPortal): AnonChild = js.native
  def getRules(): js.Array[RuleObject] = js.native
  def getValue(): js.Any = js.native
  def getValue(store: Store): js.Any = js.native
  def isFieldTouched(): Boolean = js.native
  def isFieldValidating(): Boolean = js.native
  def onStoreChange(store: Store, namePathList: js.Array[InternalNamePath], info: NotifyInfo): Unit = js.native
  def onStoreChange(store: Store, namePathList: Null, info: NotifyInfo): Unit = js.native
  def reRender(): Unit = js.native
  def refresh(): Unit = js.native
  def validateRules(): js.Promise[js.Array[String]] = js.native
  def validateRules(options: ValidateOptions): js.Promise[js.Array[String]] = js.native
}

