package typings.servicenow

import typings.servicenow.servicenow.GlideRecordOperation
import typings.servicenow.servicenow.QueryOperator
import typings.servicenow.servicenow.RestHTTPMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicenowStrings {
  
  @js.native
  sealed trait CONTAINS extends QueryOperator
  @scala.inline
  def CONTAINS: CONTAINS = "CONTAINS".asInstanceOf[CONTAINS]
  
  @js.native
  sealed trait DOESNOTCONTAIN extends QueryOperator
  @scala.inline
  def DOESNOTCONTAIN: DOESNOTCONTAIN = "DOESNOTCONTAIN".asInstanceOf[DOESNOTCONTAIN]
  
  @js.native
  sealed trait ENDSWITH extends QueryOperator
  @scala.inline
  def ENDSWITH: ENDSWITH = "ENDSWITH".asInstanceOf[ENDSWITH]
  
  @js.native
  sealed trait Equalssign extends QueryOperator
  @scala.inline
  def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  
  @js.native
  sealed trait ExclamationmarkEqualssign extends QueryOperator
  @scala.inline
  def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait Greaterthansign extends QueryOperator
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign extends QueryOperator
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait IN extends QueryOperator
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait INSTANCEOF extends QueryOperator
  @scala.inline
  def INSTANCEOF: INSTANCEOF = "INSTANCEOF".asInstanceOf[INSTANCEOF]
  
  @js.native
  sealed trait Lessthansign extends QueryOperator
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign extends QueryOperator
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait STARTSWITH extends QueryOperator
  @scala.inline
  def STARTSWITH: STARTSWITH = "STARTSWITH".asInstanceOf[STARTSWITH]
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait basic extends StObject
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait delete
    extends GlideRecordOperation
       with RestHTTPMethods
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait elevated extends StObject
  @scala.inline
  def elevated: elevated = "elevated".asInstanceOf[elevated]
  
  @js.native
  sealed trait get extends RestHTTPMethods
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait head extends RestHTTPMethods
  @scala.inline
  def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait insert extends GlideRecordOperation
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait options extends RestHTTPMethods
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait patch extends RestHTTPMethods
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait post extends RestHTTPMethods
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait put extends RestHTTPMethods
  @scala.inline
  def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait update extends GlideRecordOperation
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}
