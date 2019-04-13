package typings
package sizzleLib.sizzleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectors extends js.Object {
  var attrHandle: sizzleLib.sizzleMod.SelectorsNs.AttrHandleFunctions
  var cacheLength: scala.Double
  var filter: sizzleLib.sizzleMod.SelectorsNs.FilterFunctions
  var find: sizzleLib.sizzleMod.SelectorsNs.FindFunctions
  var `match`: sizzleLib.sizzleMod.SelectorsNs.Matches
  var preFilter: sizzleLib.sizzleMod.SelectorsNs.PreFilterFunctions
  var pseudos: sizzleLib.sizzleMod.SelectorsNs.PseudoFunctions
  var setFilters: sizzleLib.sizzleMod.SelectorsNs.SetFilterFunctions
  def createPseudo(fn: sizzleLib.sizzleMod.SelectorsNs.CreatePseudoFunction): sizzleLib.sizzleMod.SelectorsNs.PseudoFunction
}

object Selectors {
  @scala.inline
  def apply(
    attrHandle: sizzleLib.sizzleMod.SelectorsNs.AttrHandleFunctions,
    cacheLength: scala.Double,
    createPseudo: sizzleLib.sizzleMod.SelectorsNs.CreatePseudoFunction => sizzleLib.sizzleMod.SelectorsNs.PseudoFunction,
    filter: sizzleLib.sizzleMod.SelectorsNs.FilterFunctions,
    find: sizzleLib.sizzleMod.SelectorsNs.FindFunctions,
    `match`: sizzleLib.sizzleMod.SelectorsNs.Matches,
    preFilter: sizzleLib.sizzleMod.SelectorsNs.PreFilterFunctions,
    pseudos: sizzleLib.sizzleMod.SelectorsNs.PseudoFunctions,
    setFilters: sizzleLib.sizzleMod.SelectorsNs.SetFilterFunctions
  ): Selectors = {
    val __obj = js.Dynamic.literal(attrHandle = attrHandle, cacheLength = cacheLength, createPseudo = js.Any.fromFunction1(createPseudo), filter = filter, find = find, preFilter = preFilter, pseudos = pseudos, setFilters = setFilters)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Selectors]
  }
}

