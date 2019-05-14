package typings
package showdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object showdownMod {
  /**
    * Showdown event listener.
    */
  type EventListener = js.Function5[
    /* evtName */ java.lang.String, 
    /* text */ java.lang.String, 
    /* converter */ Converter, 
    /* options */ ShowdownOptions, 
    /* globals */ ConverterGlobals, 
    scala.Unit | java.lang.String
  ]
  type Metadata = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Showdown extensions store object.
    */
  type ShowdownExtensions = org.scalablytyped.runtime.StringDictionary[js.Array[ShowdownExtension]]
  /**
    * Showdown options schema.
    */
  type ShowdownOptionsSchema = org.scalablytyped.runtime.StringDictionary[ShowdownOptionDescription]
  /**
    * Showdown subParser.
    */
  type SubParser = js.Function1[/* repeated */ js.Any, java.lang.String]
}
