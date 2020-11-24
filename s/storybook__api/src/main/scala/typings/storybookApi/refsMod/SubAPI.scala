package typings.storybookApi.refsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubAPI extends js.Object {
  
  def changeRefState(id: String, ready: Boolean): Unit = js.native
  
  def changeRefVersion(id: String, url: String): Unit = js.native
  
  def checkRef(ref: SetRefData): js.Promise[Unit] = js.native
  
  def findRef(source: String): ComposedRef = js.native
  
  def getRefs(): Refs = js.native
  
  def setRef(id: String, data: SetRefData): Unit = js.native
  def setRef(id: String, data: SetRefData, ready: Boolean): Unit = js.native
  
  def updateRef(id: String, ref: ComposedRefUpdate): Unit = js.native
}
