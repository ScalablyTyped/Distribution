package typings.showdown

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object showdownMod {
  /**
    * Showdown event listener.
    */
  type EventListener = js.Function5[
    /* evtName */ String, 
    /* text */ String, 
    /* converter */ Converter, 
    /* options */ ShowdownOptions, 
    /* globals */ ConverterGlobals, 
    Unit | String
  ]
  type Metadata = StringDictionary[String]
  /**
    * Showdown extensions store object.
    */
  type ShowdownExtensions = StringDictionary[js.Array[ShowdownExtension]]
  /**
    * Showdown options schema.
    */
  type ShowdownOptionsSchema = StringDictionary[ShowdownOptionDescription]
  /**
    * Showdown subParser.
    */
  type SubParser = js.Function1[/* repeated */ js.Any, String]
}
