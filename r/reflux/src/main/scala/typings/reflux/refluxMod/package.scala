package typings.reflux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object refluxMod {
  import org.scalablytyped.runtime.StringDictionary

  type ActionObjectDefinition = StringDictionary[ActionParameters]
  type Actions = StringDictionary[Listenable]
}
