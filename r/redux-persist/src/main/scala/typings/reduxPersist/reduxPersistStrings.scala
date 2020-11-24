package typings.reduxPersist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxPersistStrings {
  
  @scala.inline
  def persistColon: persistColon = "persist:".asInstanceOf[persistColon]
  
  @scala.inline
  def persistSlashFLUSH: persistSlashFLUSH = "persist/FLUSH".asInstanceOf[persistSlashFLUSH]
  
  @scala.inline
  def persistSlashPAUSE: persistSlashPAUSE = "persist/PAUSE".asInstanceOf[persistSlashPAUSE]
  
  @scala.inline
  def persistSlashPERSIST: persistSlashPERSIST = "persist/PERSIST".asInstanceOf[persistSlashPERSIST]
  
  @scala.inline
  def persistSlashPURGE: persistSlashPURGE = "persist/PURGE".asInstanceOf[persistSlashPURGE]
  
  @scala.inline
  def persistSlashREGISTER: persistSlashREGISTER = "persist/REGISTER".asInstanceOf[persistSlashREGISTER]
  
  @scala.inline
  def persistSlashREHYDRATE: persistSlashREHYDRATE = "persist/REHYDRATE".asInstanceOf[persistSlashREHYDRATE]
  
  @js.native
  sealed trait persistColon extends js.Object
  
  @js.native
  sealed trait persistSlashFLUSH extends js.Object
  
  @js.native
  sealed trait persistSlashPAUSE extends js.Object
  
  @js.native
  sealed trait persistSlashPERSIST extends js.Object
  
  @js.native
  sealed trait persistSlashPURGE extends js.Object
  
  @js.native
  sealed trait persistSlashREGISTER extends js.Object
  
  @js.native
  sealed trait persistSlashREHYDRATE extends js.Object
}
