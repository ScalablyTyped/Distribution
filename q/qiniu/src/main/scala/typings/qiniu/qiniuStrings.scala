package typings.qiniu

import typings.qiniu.mod.rs.BucketEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qiniuStrings {
  
  @js.native
  sealed trait append
    extends StObject
       with BucketEventName
  inline def append: append = "append".asInstanceOf[append]
  
  @js.native
  sealed trait copy
    extends StObject
       with BucketEventName
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait delete
    extends StObject
       with BucketEventName
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait deleteMarkerCreate
    extends StObject
       with BucketEventName
  inline def deleteMarkerCreate: deleteMarkerCreate = "deleteMarkerCreate".asInstanceOf[deleteMarkerCreate]
  
  @js.native
  sealed trait disable
    extends StObject
       with BucketEventName
  inline def disable: disable = "disable".asInstanceOf[disable]
  
  @js.native
  sealed trait enable
    extends StObject
       with BucketEventName
  inline def enable: enable = "enable".asInstanceOf[enable]
  
  @js.native
  sealed trait mkfile
    extends StObject
       with BucketEventName
  inline def mkfile: mkfile = "mkfile".asInstanceOf[mkfile]
  
  @js.native
  sealed trait move
    extends StObject
       with BucketEventName
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait predelete
    extends StObject
       with BucketEventName
  inline def predelete: predelete = "predelete".asInstanceOf[predelete]
  
  @js.native
  sealed trait put
    extends StObject
       with BucketEventName
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait restoreColoncompleted
    extends StObject
       with BucketEventName
  inline def restoreColoncompleted: restoreColoncompleted = "restore:completed".asInstanceOf[restoreColoncompleted]
}
