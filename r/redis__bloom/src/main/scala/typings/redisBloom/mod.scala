package typings.redisBloom

import typings.redisBloom.anon.ADDNX
import typings.redisBloom.anon.ADD_
import typings.redisBloom.anon.Add
import typings.redisBloom.anon.INCRBY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@redis/bloom", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@redis/bloom", "default.bf")
    @js.native
    def bf: ADD_ = js.native
    inline def bf_=(x: ADD_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bf")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/bloom", "default.cf")
    @js.native
    def cf: ADDNX = js.native
    inline def cf_=(x: ADDNX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cf")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/bloom", "default.cms")
    @js.native
    def cms: INCRBY = js.native
    inline def cms_=(x: INCRBY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cms")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/bloom", "default.topK")
    @js.native
    def topK: Add = js.native
    inline def topK_=(x: Add): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topK")(x.asInstanceOf[js.Any])
  }
}
