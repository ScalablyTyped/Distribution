package typings.std.global

import typings.std.WorkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Worker")
@js.native
class Worker protected ()
  extends typings.std.Worker {
  def this(stringUrl: java.lang.String) = this()
  def this(stringUrl: typings.std.URL) = this()
  def this(stringUrl: java.lang.String, options: WorkerOptions) = this()
  def this(stringUrl: typings.std.URL, options: WorkerOptions) = this()
}
