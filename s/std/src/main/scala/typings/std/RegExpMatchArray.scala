package typings.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExpMatchArray
  extends StObject
     with Array[java.lang.String] {
  
  /* standard es2018.regexp */
  var groups: js.UndefOr[/* standard es2018.regexp */
  StringDictionary[java.lang.String]] = js.native
  
  /**
    * The index of the search at which the result was found.
    */
  /* standard es5 */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * A copy of the search string.
    */
  /* standard es5 */
  var input: js.UndefOr[java.lang.String] = js.native
}
