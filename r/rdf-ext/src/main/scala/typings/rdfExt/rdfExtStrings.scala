package typings.rdfExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rdfExtStrings {
  @js.native
  sealed trait graph extends js.Object
  
  @js.native
  sealed trait language extends js.Object
  
  @js.native
  sealed trait `object` extends js.Object
  
  @js.native
  sealed trait predicate extends js.Object
  
  @js.native
  sealed trait subject extends js.Object
  
  @js.native
  sealed trait termType extends js.Object
  
  @js.native
  sealed trait toJSON extends js.Object
  
  @js.native
  sealed trait value extends js.Object
  
  @scala.inline
  def graph: graph = "graph".asInstanceOf[graph]
  @scala.inline
  def language: language = "language".asInstanceOf[language]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def predicate: predicate = "predicate".asInstanceOf[predicate]
  @scala.inline
  def subject: subject = "subject".asInstanceOf[subject]
  @scala.inline
  def termType: termType = "termType".asInstanceOf[termType]
  @scala.inline
  def toJSON: toJSON = "toJSON".asInstanceOf[toJSON]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
}

