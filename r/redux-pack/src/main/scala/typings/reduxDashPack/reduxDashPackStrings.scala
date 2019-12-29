package typings.reduxDashPack

import typings.reduxDashPack.reduxDashPackMod.LIFECYCLEValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxDashPackStrings {
  @js.native
  sealed trait failure extends LIFECYCLEValues
  
  @js.native
  sealed trait `redux-packSlashLIFECYCLE` extends js.Object
  
  @js.native
  sealed trait `redux-packSlashTRANSACTION` extends js.Object
  
  @js.native
  sealed trait start extends LIFECYCLEValues
  
  @js.native
  sealed trait succes extends LIFECYCLEValues
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def `redux-packSlashLIFECYCLE`: `redux-packSlashLIFECYCLE` = "redux-pack/LIFECYCLE".asInstanceOf[`redux-packSlashLIFECYCLE`]
  @scala.inline
  def `redux-packSlashTRANSACTION`: `redux-packSlashTRANSACTION` = "redux-pack/TRANSACTION".asInstanceOf[`redux-packSlashTRANSACTION`]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def succes: succes = "succes".asInstanceOf[succes]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

