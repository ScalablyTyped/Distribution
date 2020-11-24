package typings.sharepoint.global.Srch

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Srch.Refinement")
@js.native
class Refinement protected ()
  extends typings.sharepoint.Srch.Refinement {
  def this(elem: Element) = this()
}
/* static members */
@JSGlobal("Srch.Refinement")
@js.native
object Refinement extends js.Object {
  
  def createRefinementTextbox(name: String): Element = js.native
  
  def ensureUserSpecifiedRefinerValueHasWhiteSpaceQuotes(inputText: String): String = js.native
  
  /** Gets expanded state of the specified filter from cookie */
  def getExpanded(filterName: String): String = js.native
  
  def getRefinementLocalizedTitle(propertyName: String): String = js.native
  
  def getRefinementTitle(currentRefinemntControl: typings.sharepoint.Srch.RefinementControl): String = js.native
  
  def multiRefinerSpecifyOtherFilterValue(
    refinerName: String,
    clientControl: typings.sharepoint.Srch.Refinement,
    useContains: Boolean,
    useKQL: Boolean
  ): Unit = js.native
  
  /** Save expanded state of the specified filter to cookie */
  def setExpanded(filterName: String, value: String): Unit = js.native
  
  def submitMultiRefinement(name: String, control: typings.sharepoint.Srch.Refinement, useContains: Boolean, useKQL: Boolean): Unit = js.native
}
