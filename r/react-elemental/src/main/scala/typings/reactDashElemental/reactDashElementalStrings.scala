package typings.reactDashElemental

import typings.reactDashElemental.reactDashElementalMod.AlertSize
import typings.reactDashElemental.reactDashElementalMod.AlertType
import typings.reactDashElemental.reactDashElementalMod.ButtonSize
import typings.reactDashElemental.reactDashElementalMod.LinkType
import typings.reactDashElemental.reactDashElementalMod.ModalSize
import typings.reactDashElemental.reactDashElementalMod.PulsatorSize
import typings.reactDashElemental.reactDashElementalMod.SpinnerSize
import typings.reactDashElemental.reactDashElementalMod.TagSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashElementalStrings {
  @js.native
  sealed trait alpha
    extends AlertSize
       with ButtonSize
       with ModalSize
       with PulsatorSize
       with SpinnerSize
       with TagSize
  
  @js.native
  sealed trait beta
    extends AlertSize
       with ButtonSize
       with ModalSize
       with PulsatorSize
       with SpinnerSize
       with TagSize
  
  @js.native
  sealed trait delta
    extends PulsatorSize
       with SpinnerSize
  
  @js.native
  sealed trait error extends AlertType
  
  @js.native
  sealed trait gamma
    extends ButtonSize
       with ModalSize
       with PulsatorSize
       with SpinnerSize
  
  @js.native
  sealed trait info extends AlertType
  
  @js.native
  sealed trait plain extends LinkType
  
  @js.native
  sealed trait regular extends LinkType
  
  @js.native
  sealed trait success extends AlertType
  
  @js.native
  sealed trait underline extends LinkType
  
  @js.native
  sealed trait warn extends AlertType
  
  @scala.inline
  def alpha: alpha = "alpha".asInstanceOf[alpha]
  @scala.inline
  def beta: beta = "beta".asInstanceOf[beta]
  @scala.inline
  def delta: delta = "delta".asInstanceOf[delta]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def gamma: gamma = "gamma".asInstanceOf[gamma]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def plain: plain = "plain".asInstanceOf[plain]
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def underline: underline = "underline".asInstanceOf[underline]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

