package typings.rdflib

import typings.rdflib.fetcherMod._StatusValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rdflibNumbers {
  @js.native
  sealed trait `401` extends _StatusValues
  
  @js.native
  sealed trait `403` extends _StatusValues
  
  @js.native
  sealed trait `404` extends _StatusValues
  
  @scala.inline
  def `401`: `401` = 401.asInstanceOf[`401`]
  @scala.inline
  def `403`: `403` = 403.asInstanceOf[`403`]
  @scala.inline
  def `404`: `404` = 404.asInstanceOf[`404`]
}

