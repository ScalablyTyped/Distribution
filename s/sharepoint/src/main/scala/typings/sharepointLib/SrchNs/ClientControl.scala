package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.ClientControl")
@js.native
class ClientControl protected ()
  extends microsoftDashAjaxLib.SysNs.UINs.Control {
  def this(elem: stdLib.Element) = this()
  var alternateRenderContext: js.Any = js.native
  var alternateRenderer: js.Any = js.native
  var loaded: scala.Boolean = js.native
  var serverTemplateScriptsToLoad: js.Array[_] = js.native
  def clickHandler(e: stdLib.Event): js.Any = js.native
  def get_alternateErrorMessage(): java.lang.String = js.native
  /** Returns true if control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def get_delayLoadTemplateScripts(): scala.Boolean = js.native
  /** returns true if control has already been loaded at least once */
  def get_isInitialLoad(): scala.Boolean = js.native
  def get_messages(): js.Array[_] = js.native
  /** returns next unique identifier for nested controls */
  def get_nextUniqueId(): java.lang.String = js.native
  /** Gets the id of View display template that is used to render this control.
    * Example: '~sitecollection/_catalogs/masterpage/Display Templates/Search/Control_SearchResults.js'
    */
  def get_renderTemplateId(): java.lang.String = js.native
  def get_showDataErrors(): scala.Boolean = js.native
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
  ): scala.Boolean = js.native
  def loadServerTemplateScripts(): scala.Unit = js.native
  def processDataErrorMessages(dataErrorsList: js.Any): js.Any = js.native
  def processDataProviderErrors(dataProviderToProcess: js.Any): scala.Unit = js.native
  def processRenderingErrorMessages(ctx: js.Any): js.Any = js.native
  def renderControl(listData: js.Any, dataProvider: js.Any): scala.Unit = js.native
  def scriptApplication_Load(sender: js.Any, e: js.Any): scala.Unit = js.native
  def scriptApplication_PostLoad(sender: js.Any, e: js.Any): scala.Unit = js.native
  def scriptApplication_PreLoad(sender: js.Any, e: js.Any): scala.Unit = js.native
  def serverTemplateScriptsCallback(): scala.Unit = js.native
  /** show/hide the DOM element associated with control */
  def setControlElementVisibility(showElement: scala.Boolean): js.Any = js.native
  def set_alternateErrorMessage(value: java.lang.String): java.lang.String = js.native
  /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def set_delayLoadTemplateScripts(value: scala.Boolean): scala.Boolean = js.native
  def set_messages(value: js.Array[_]): js.Array[_] = js.native
  def set_renderTemplateId(value: java.lang.String): java.lang.String = js.native
  /** False by default. */
  def set_showDataErrors(value: scala.Boolean): scala.Boolean = js.native
  def set_states(value: js.Any): js.Any = js.native
  def updateDisplayControlWithNewMessages(): js.Any = js.native
}

/* static members */
@JSGlobal("Srch.ClientControl")
@js.native
object ClientControl extends js.Object {
  /** toggles visibility of children controls of the messageContainer */
  def toggleMessageDetails(messageContainer: stdLib.Element): scala.Unit = js.native
}

