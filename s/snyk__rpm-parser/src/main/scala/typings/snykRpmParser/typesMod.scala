package typings.snykRpmParser

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/rpm-parser/dist/berkeleydb/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  sealed trait DatabasePageType extends js.Object
  
  @js.native
  sealed trait HashPageType extends js.Object
  
  @js.native
  sealed trait MagicNumber extends js.Object
  
  val DATABASE_PAGE_HEADER_SIZE: /* 26 */ Double = js.native
  val HASH_INDEX_ENTRY_SIZE: /* 2 */ Double = js.native
  @js.native
  object DatabasePageType extends js.Object {
    @js.native
    sealed trait P_HASH extends DatabasePageType
    
    @js.native
    sealed trait P_HASHMETA extends DatabasePageType
    
    @js.native
    sealed trait P_OVERFLOW extends DatabasePageType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DatabasePageType with Double] = js.native
    /* 13 */ @js.native
    object P_HASH extends TopLevel[P_HASH with Double]
    
    /* 8 */ @js.native
    object P_HASHMETA extends TopLevel[P_HASHMETA with Double]
    
    /* 7 */ @js.native
    object P_OVERFLOW extends TopLevel[P_OVERFLOW with Double]
    
  }
  
  @js.native
  object HashPageType extends js.Object {
    @js.native
    sealed trait H_OFFPAGE extends HashPageType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HashPageType with Double] = js.native
    /* 3 */ @js.native
    object H_OFFPAGE extends TopLevel[H_OFFPAGE with Double]
    
  }
  
  @js.native
  object MagicNumber extends js.Object {
    @js.native
    sealed trait DB_HASH extends MagicNumber
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MagicNumber with Double] = js.native
    /* 398689 */ @js.native
    object DB_HASH extends TopLevel[DB_HASH with Double]
    
  }
  
}

