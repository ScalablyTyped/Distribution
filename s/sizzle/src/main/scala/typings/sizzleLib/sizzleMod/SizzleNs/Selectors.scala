package typings
package sizzleLib.sizzleMod.SizzleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectors extends js.Object {
  var attrHandle: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.AttrHandleFunctions
  var cacheLength: scala.Double
  var filter: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.FilterFunctions
  var find: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.FindFunctions
  var `match`: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.Matches
  var preFilter: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PreFilterFunctions
  var pseudos: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PseudoFunctions
  var setFilters: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.SetFilterFunctions
  def createPseudo(fn: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.CreatePseudoFunction): sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PseudoFunction
}

object Selectors {
  @scala.inline
  def apply(
    attrHandle: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.AttrHandleFunctions,
    cacheLength: scala.Double,
    createPseudo: js.Function1[
      sizzleLib.sizzleMod.SizzleNs.SelectorsNs.CreatePseudoFunction, 
      sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PseudoFunction
    ],
    filter: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.FilterFunctions,
    find: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.FindFunctions,
    `match`: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.Matches,
    preFilter: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PreFilterFunctions,
    pseudos: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PseudoFunctions,
    setFilters: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.SetFilterFunctions
  ): Selectors = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("attrHandle")(attrHandle)
    __obj.updateDynamic("cacheLength")(cacheLength)
    __obj.updateDynamic("createPseudo")(createPseudo)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("find")(find)
    __obj.updateDynamic("preFilter")(preFilter)
    __obj.updateDynamic("pseudos")(pseudos)
    __obj.updateDynamic("setFilters")(setFilters)
    __obj.asInstanceOf[Selectors]
  }
}

