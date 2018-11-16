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

