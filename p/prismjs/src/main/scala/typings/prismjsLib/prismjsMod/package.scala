package typings
package prismjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prismjsMod {
  type AvailableHooks = prismjsLib.prismjsLibStrings.`before-highlightall` | prismjsLib.prismjsLibStrings.`before-sanity-check` | prismjsLib.prismjsLibStrings.`before-highlight` | prismjsLib.prismjsLibStrings.`before-insert` | prismjsLib.prismjsLibStrings.`after-highlight` | prismjsLib.prismjsLibStrings.complete | prismjsLib.prismjsLibStrings.wrap
  type HookCallback = js.Function1[/* env */ Environment, scala.Unit]
  type Languages = LanguageMap with LanguageMapProtocol
  type TokenNode = Token | java.lang.String | (js.Array[Token | java.lang.String])
}
