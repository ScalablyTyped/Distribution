package typings.servicenowLondon

import typings.servicenowLondon.snWs.RestHTTPMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object servicenowLondonStrings {
  @js.native
  sealed trait CONTAINS extends QueryOperator
  
  @js.native
  sealed trait `DOES NOT CONTAIN` extends QueryOperator
  
  @js.native
  sealed trait ENDSWITH extends QueryOperator
  
  @js.native
  sealed trait Equalssign extends QueryOperator
  
  @js.native
  sealed trait ExclamationmarkEqualssign extends QueryOperator
  
  @js.native
  sealed trait Greaterthansign extends QueryOperator
  
  @js.native
  sealed trait GreaterthansignEqualssign extends QueryOperator
  
  @js.native
  sealed trait IN extends QueryOperator
  
  @js.native
  sealed trait INSTANCEOF extends QueryOperator
  
  @js.native
  sealed trait Lessthansign extends QueryOperator
  
  @js.native
  sealed trait LessthansignEqualssign extends QueryOperator
  
  @js.native
  sealed trait `NOT IN` extends QueryOperator
  
  @js.native
  sealed trait SAMEAS extends QueryOperator
  
  @js.native
  sealed trait STARTSWITH extends QueryOperator
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait basic extends js.Object
  
  @js.native
  sealed trait delete
    extends GlideRecordOperation
       with RestHTTPMethods
  
  @js.native
  sealed trait elevated extends js.Object
  
  @js.native
  sealed trait get extends RestHTTPMethods
  
  @js.native
  sealed trait head extends RestHTTPMethods
  
  @js.native
  sealed trait insert extends GlideRecordOperation
  
  @js.native
  sealed trait options extends RestHTTPMethods
  
  @js.native
  sealed trait patch extends RestHTTPMethods
  
  @js.native
  sealed trait post extends RestHTTPMethods
  
  @js.native
  sealed trait put extends RestHTTPMethods
  
  @js.native
  sealed trait update extends GlideRecordOperation
  
  @scala.inline
  def CONTAINS: CONTAINS = "CONTAINS".asInstanceOf[CONTAINS]
  @scala.inline
  def `DOES NOT CONTAIN`: `DOES NOT CONTAIN` = ("DOES NOT CONTAIN").asInstanceOf[`DOES NOT CONTAIN`]
  @scala.inline
  def ENDSWITH: ENDSWITH = "ENDSWITH".asInstanceOf[ENDSWITH]
  @scala.inline
  def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  @scala.inline
  def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  @scala.inline
  def INSTANCEOF: INSTANCEOF = "INSTANCEOF".asInstanceOf[INSTANCEOF]
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  @scala.inline
  def `NOT IN`: `NOT IN` = ("NOT IN").asInstanceOf[`NOT IN`]
  @scala.inline
  def SAMEAS: SAMEAS = "SAMEAS".asInstanceOf[SAMEAS]
  @scala.inline
  def STARTSWITH: STARTSWITH = "STARTSWITH".asInstanceOf[STARTSWITH]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def elevated: elevated = "elevated".asInstanceOf[elevated]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def head: head = "head".asInstanceOf[head]
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  @scala.inline
  def put: put = "put".asInstanceOf[put]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}

