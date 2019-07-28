package typings.sharepoint.SrchNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.Refinement")
@js.native
class Refinement protected () extends DisplayControl {
  def this(elem: Element) = this()
  def addRefinementFilter(filterName: String, filterToken: js.Any): Unit = js.native
  def addRefinementFilters(refiners: js.Array[_]): Unit = js.native
  def addRefinementFiltersJSON(refinersJSON: String): Unit = js.native
  def addRefinementFiltersJSONWithOr(refinersJSON: String): Unit = js.native
  def addRefinementFiltersWithOp(refiners: js.Array[_], op: String): Unit = js.native
  def getCurrentRefinementCategory(refinementName: String): js.Any = js.native
  /** Gets refinement control with the specified propertyName */
  def getRefinementControl(refinerName: String): RefinementControl = js.native
  def get_emptyRefinementMessageId(): String = js.native
  def get_selectedRefinementControls(): js.Array[RefinementControl] = js.native
  def get_useManagedNavigationRefiners(): Boolean = js.native
  def hasAllRefinementFilters(filterName: String, filterTokens: js.Array[String]): Boolean = js.native
  def hasRefinementCategory(refinementName: String): Boolean = js.native
  def hasRefinementFilter(filterName: String, filterToken: String): Boolean = js.native
  /** Returns true if selected refinement controls collection contains a control with the specified propertyName */
  def hasRefiner(refinerName: String): Boolean = js.native
  def removeRefinementCategory(rcs: js.Any, filterName: String): Unit = js.native
  def removeRefinementFilter(filterName: String, filterToken: String): Unit = js.native
  def removeRefinementFiltersJSON(refinersJSON: String): Unit = js.native
  def replaceRefinementFilter(oldRefinementFilter: js.Any, newRefinementFilter: js.Any): Unit = js.native
  def set_emptyRefinementMessageId(value: String): String = js.native
  def set_selectedRefinementControls(value: js.Array[RefinementControl]): js.Array[RefinementControl] = js.native
  def set_useManagedNavigationRefiners(value: Boolean): Boolean = js.native
  /** Replaces the refinement controls */
  def updateRefinementControls(newControls: js.Array[RefinementControl]): Unit = js.native
  def updateRefinementFilters(
    filterName: String,
    filterTokens: js.Array[String],
    op: String,
    useKQL: Boolean,
    tokenToDisplayValueMap: js.Any
  ): Unit = js.native
  def updateRefiners(refiners: js.Array[_], op: String, useKQL: Boolean, tokenToDisplayValueMap: js.Any): Unit = js.native
  def updateRefinersJSON(refinersJSON: String): Unit = js.native
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
  def getRefinementTitle(currentRefinemntControl: Refinement): String = js.native
  def multiRefinerSpecifyOtherFilterValue(refinerName: String, clientControl: Refinement, useContains: Boolean, useKQL: Boolean): Unit = js.native
  /** Save expanded state of the specified filter to cookie */
  def setExpanded(filterName: String, value: String): Unit = js.native
  def submitMultiRefinement(name: String, control: Refinement, useContains: Boolean, useKQL: Boolean): Unit = js.native
}

