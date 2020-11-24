package typings.protractorBrowserLogs.mod

import typings.seleniumWebdriver.mod.logging.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserLogs extends js.Object {
  
  def DEBUG(entry: Entry): Boolean = js.native
  @JSName("DEBUG")
  var DEBUG_Original: matchPredicateFunction = js.native
  
  def ERROR(entry: Entry): Boolean = js.native
  @JSName("ERROR")
  var ERROR_Original: matchPredicateFunction = js.native
  
  def INFO(entry: Entry): Boolean = js.native
  @JSName("INFO")
  var INFO_Original: matchPredicateFunction = js.native
  
  def LOG(entry: Entry): Boolean = js.native
  @JSName("LOG")
  var LOG_Original: matchPredicateFunction = js.native
  
  def WARNING(entry: Entry): Boolean = js.native
  @JSName("WARNING")
  var WARNING_Original: matchPredicateFunction = js.native
  
  def and(a: matchPredicateFunction, b: matchPredicateFunction): matchPredicateFunction = js.native
  
  def expect(matches: matchPredicate*): js.Array[matchPredicateFunction] = js.native
  
  def ignore(matches: matchPredicate*): js.Array[matchPredicateFunction] = js.native
  
  def logs(): js.Array[Entry] = js.native
  
  def or(a: matchPredicateFunction, b: matchPredicateFunction): matchPredicateFunction = js.native
  
  def reset(): Unit = js.native
  
  def verify(): Unit = js.native
}
