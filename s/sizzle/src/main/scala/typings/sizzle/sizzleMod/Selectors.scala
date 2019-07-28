package typings.sizzle.sizzleMod

import typings.sizzle.sizzleMod.SelectorsNs.AttrHandleFunctions
import typings.sizzle.sizzleMod.SelectorsNs.CreatePseudoFunction
import typings.sizzle.sizzleMod.SelectorsNs.FilterFunctions
import typings.sizzle.sizzleMod.SelectorsNs.FindFunctions
import typings.sizzle.sizzleMod.SelectorsNs.Matches
import typings.sizzle.sizzleMod.SelectorsNs.PreFilterFunctions
import typings.sizzle.sizzleMod.SelectorsNs.PseudoFunction
import typings.sizzle.sizzleMod.SelectorsNs.PseudoFunctions
import typings.sizzle.sizzleMod.SelectorsNs.SetFilterFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectors extends js.Object {
  var attrHandle: AttrHandleFunctions
  var cacheLength: Double
  var filter: FilterFunctions
  var find: FindFunctions
  var `match`: Matches
  var preFilter: PreFilterFunctions
  var pseudos: PseudoFunctions
  var setFilters: SetFilterFunctions
  def createPseudo(fn: CreatePseudoFunction): PseudoFunction
}

object Selectors {
  @scala.inline
  def apply(
    attrHandle: AttrHandleFunctions,
    cacheLength: Double,
    createPseudo: CreatePseudoFunction => PseudoFunction,
    filter: FilterFunctions,
    find: FindFunctions,
    `match`: Matches,
    preFilter: PreFilterFunctions,
    pseudos: PseudoFunctions,
    setFilters: SetFilterFunctions
  ): Selectors = {
    val __obj = js.Dynamic.literal(attrHandle = attrHandle, cacheLength = cacheLength, createPseudo = js.Any.fromFunction1(createPseudo), filter = filter, find = find, preFilter = preFilter, pseudos = pseudos, setFilters = setFilters)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Selectors]
  }
}

