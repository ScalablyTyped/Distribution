package typings.puppeteer.puppeteerTypesMod

import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer/lib/cjs/puppeteer/types", "PipeTransport")
@js.native
open class PipeTransport protected ()
  extends typings.puppeteer.pipeTransportMod.PipeTransport {
  def this(pipeWrite: WritableStream[Any], pipeRead: ReadableStream[Any]) = this()
}
