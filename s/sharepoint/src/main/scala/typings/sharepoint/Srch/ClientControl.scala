package typings.sharepoint.Srch

import typings.microsoftAjax.Sys.UI.Control
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.ClientControl")
@js.native
class ClientControl protected () extends Control {
  def this(elem: Element) = this()
  var alternateRenderContext: js.Any = js.native
  var alternateRenderer: js.Any = js.native
  var loaded: Boolean = js.native
  var serverTemplateScriptsToLoad: js.Array[_] = js.native
  def clickHandler(e: Event_): js.Any = js.native
  def get_alternateErrorMessage(): String = js.native
  /** Returns true if control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def get_delayLoadTemplateScripts(): Boolean = js.native
  /** returns true if control has already been loaded at least once */
  def get_isInitialLoad(): Boolean = js.native
  def get_messages(): js.Array[_] = js.native
  /** returns next unique identifier for nested controls */
  def get_nextUniqueId(): String = js.native
  /** Gets the id of View display template that is used to render this control.
    * Example: '~sitecollection/_catalogs/masterpage/Display Templates/Search/Control_SearchResults.js'
    */
  def get_renderTemplateId(): String = js.native
  def get_showDataErrors(): Boolean = js.native
  def get_states(): js.Any = js.native
  def hasMessages(): js.Any = js.native
  def invokeAlternateRender(callback: js.Any, container: js.Any, ctx: js.Any): js.Any = js.native
  def invokeClientRenderer(node: js.Any, ctx: js.Any): js.Any = js.native
  def loadRenderTemplateScripts(
    scriptReferences: js.Any,
    success: js.Any,
    failure: js.Any,
    timeout: js.Any,
    loadStandAloneCustomScripts: js.Any
  ): Boolean = js.native
  def loadServerTemplateScripts(): Unit = js.native
  def processDataErrorMessages(dataErrorsList: js.Any): js.Any = js.native
  def processDataProviderErrors(dataProviderToProcess: js.Any): Unit = js.native
  def processRenderingErrorMessages(ctx: js.Any): js.Any = js.native
  def renderControl(listData: js.Any, dataProvider: js.Any): Unit = js.native
  def scriptApplication_Load(sender: js.Any, e: js.Any): Unit = js.native
  def scriptApplication_PostLoad(sender: js.Any, e: js.Any): Unit = js.native
  def scriptApplication_PreLoad(sender: js.Any, e: js.Any): Unit = js.native
  def serverTemplateScriptsCallback(): Unit = js.native
  /** show/hide the DOM element associated with control */
  def setControlElementVisibility(showElement: Boolean): js.Any = js.native
  def set_alternateErrorMessage(value: String): String = js.native
  /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def set_delayLoadTemplateScripts(value: Boolean): Boolean = js.native
  def set_messages(value: js.Array[_]): js.Array[_] = js.native
  def set_renderTemplateId(value: String): String = js.native
  /** False by default. */
  def set_showDataErrors(value: Boolean): Boolean = js.native
  def set_states(value: js.Any): js.Any = js.native
  def updateDisplayControlWithNewMessages(): js.Any = js.native
}

/* static members */
@JSGlobal("Srch.ClientControl")
@js.native
object ClientControl extends js.Object {
  /** toggles visibility of children controls of the messageContainer */
  def toggleMessageDetails(messageContainer: Element): Unit = js.native
}

