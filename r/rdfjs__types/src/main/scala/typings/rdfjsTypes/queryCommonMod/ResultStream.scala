package typings.rdfjsTypes.queryCommonMod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultStream[Q] extends EventEmitter {
  
  def read(): Q | Null = js.native
}
