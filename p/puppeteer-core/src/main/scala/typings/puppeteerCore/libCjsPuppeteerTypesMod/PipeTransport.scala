package typings.puppeteerCore.libCjsPuppeteerTypesMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core/lib/cjs/puppeteer/types", "PipeTransport")
@js.native
open class PipeTransport protected ()
  extends typings.puppeteerCore.libCjsPuppeteerNodePipeTransportMod.PipeTransport {
  def this(pipeWrite: WritableStream, pipeRead: ReadableStream) = this()
}
