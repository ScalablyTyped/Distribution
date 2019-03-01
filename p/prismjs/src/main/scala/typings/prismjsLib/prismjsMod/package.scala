package typings
package prismjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prismjsMod {
  type HookCallback = js.Function1[/* env */ Environment, scala.Unit]
  type Languages = LanguageMap with LanguageMapProtocol
  type TokenNode = Token | java.lang.String | (js.Array[Token | java.lang.String])
}
