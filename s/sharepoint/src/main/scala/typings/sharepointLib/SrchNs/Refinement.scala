package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Srch.Refinement")
@js.native
class Refinement protected () extends DisplayControl {
  def this(elem: stdLib.Element) = this()
  def addRefinementFilter(filterName: java.lang.String, filterToken: js.Any): scala.Unit = js.native
  def addRefinementFilters(refiners: js.Array[_]): scala.Unit = js.native
  def addRefinementFiltersJSON(refinersJSON: java.lang.String): scala.Unit = js.native
  def addRefinementFiltersJSONWithOr(refinersJSON: java.lang.String): scala.Unit = js.native
  def addRefinementFiltersWithOp(refiners: js.Array[_], op: java.lang.String): scala.Unit = js.native
  def getCurrentRefinementCategory(refinementName: java.lang.String): js.Any = js.native
  /** Gets refinement control with the specified propertyName */
  def getRefinementControl(refinerName: java.lang.String): RefinementControl = js.native
  def get_emptyRefinementMessageId(): java.lang.String = js.native
  def get_selectedRefinementControls(): js.Array[RefinementControl] = js.native
  def get_useManagedNavigationRefiners(): scala.Boolean = js.native
  def hasAllRefinementFilters(filterName: java.lang.String, filterTokens: js.Array[java.lang.String]): scala.Boolean = js.native
  def hasRefinementCategory(refinementName: java.lang.String): scala.Boolean = js.native
  def hasRefinementFilter(filterName: java.lang.String, filterToken: java.lang.String): scala.Boolean = js.native
  /** Returns true if selected refinement controls collection contains a control with the specified propertyName */
  def hasRefiner(refinerName: java.lang.String): scala.Boolean = js.native
  def removeRefinementCategory(rcs: js.Any, filterName: java.lang.String): scala.Unit = js.native
  def removeRefinementFilter(filterName: java.lang.String, filterToken: java.lang.String): scala.Unit = js.native
  def removeRefinementFiltersJSON(refinersJSON: java.lang.String): scala.Unit = js.native
  def replaceRefinementFilter(oldRefinementFilter: js.Any, newRefinementFilter: js.Any): scala.Unit = js.native
  def set_emptyRefinementMessageId(value: java.lang.String): java.lang.String = js.native
  def set_selectedRefinementControls(value: js.Array[RefinementControl]): js.Array[RefinementControl] = js.native
  def set_useManagedNavigationRefiners(value: scala.Boolean): scala.Boolean = js.native
  /** Replaces the refinement controls */
  def updateRefinementControls(newControls: js.Array[RefinementControl]): scala.Unit = js.native
  def updateRefinementFilters(
    filterName: java.lang.String,
    filterTokens: js.Array[java.lang.String],
    op: java.lang.String,
    useKQL: scala.Boolean,
    tokenToDisplayValueMap: js.Any
  ): scala.Unit = js.native
  def updateRefiners(refiners: js.Array[_], op: java.lang.String, useKQL: scala.Boolean, tokenToDisplayValueMap: js.Any): scala.Unit = js.native
  def updateRefinersJSON(refinersJSON: java.lang.String): scala.Unit = js.native
}

@JSGlobal("Srch.Refinement")
@js.native
object Refinement extends js.Object {
  def createRefinementTextbox(name: java.lang.String): stdLib.Element = js.native
  def ensureUserSpecifiedRefinerValueHasWhiteSpaceQuotes(inputText: java.lang.String): java.lang.String = js.native
  /** Gets expanded state of the specified filter from cookie */
  def getExpanded(filterName: java.lang.String): java.lang.String = js.native
  def getRefinementLocalizedTitle(propertyName: java.lang.String): java.lang.String = js.native
  def getRefinementTitle(currentRefinemntControl: sharepointLib.SrchNs.Refinement): java.lang.String = js.native
  def multiRefinerSpecifyOtherFilterValue(
    refinerName: java.lang.String,
    clientControl: sharepointLib.SrchNs.Refinement,
    useContains: scala.Boolean,
    useKQL: scala.Boolean
  ): scala.Unit = js.native
  /** Save expanded state of the specified filter to cookie */
  def setExpanded(filterName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def submitMultiRefinement(
    name: java.lang.String,
    control: sharepointLib.SrchNs.Refinement,
    useContains: scala.Boolean,
    useKQL: scala.Boolean
  ): scala.Unit = js.native
}

