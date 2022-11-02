package typings.redisGraph

import typings.redisGraph.anon.TypeofCONFIGGET
import typings.redisGraph.anon.TypeofCONFIGSET
import typings.redisGraph.anon.TypeofDELETE
import typings.redisGraph.anon.TypeofEXPLAIN
import typings.redisGraph.anon.TypeofLIST
import typings.redisGraph.anon.TypeofPROFILE
import typings.redisGraph.anon.TypeofQUERY
import typings.redisGraph.anon.TypeofROQUERY
import typings.redisGraph.anon.TypeofSLOWLOG
import typings.redisGraph.distGraphMod.GraphClientType
import typings.redisGraph.distGraphMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@redis/graph", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@redis/graph", "default.CONFIG_GET")
    @js.native
    def CONFIG_GET: TypeofCONFIGGET = js.native
    inline def CONFIG_GET_=(x: TypeofCONFIGGET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONFIG_GET")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.CONFIG_SET")
    @js.native
    def CONFIG_SET: TypeofCONFIGSET = js.native
    inline def CONFIG_SET_=(x: TypeofCONFIGSET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONFIG_SET")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.DELETE")
    @js.native
    def DELETE_ : TypeofDELETE = js.native
    
    inline def DELETE__=(x: TypeofDELETE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.EXPLAIN")
    @js.native
    def EXPLAIN_ : TypeofEXPLAIN = js.native
    
    inline def EXPLAIN__=(x: TypeofEXPLAIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXPLAIN")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.LIST")
    @js.native
    def LIST_ : TypeofLIST = js.native
    
    inline def LIST__=(x: TypeofLIST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.PROFILE")
    @js.native
    def PROFILE_ : TypeofPROFILE = js.native
    
    inline def PROFILE__=(x: TypeofPROFILE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROFILE")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.QUERY")
    @js.native
    def QUERY_ : TypeofQUERY = js.native
    
    inline def QUERY__=(x: TypeofQUERY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUERY")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.RO_QUERY")
    @js.native
    def RO_QUERY: TypeofROQUERY = js.native
    inline def RO_QUERY_=(x: TypeofROQUERY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RO_QUERY")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.SLOWLOG")
    @js.native
    def SLOWLOG_ : TypeofSLOWLOG = js.native
    
    inline def SLOWLOG__=(x: TypeofSLOWLOG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLOWLOG")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.configGet")
    @js.native
    def configGet: TypeofCONFIGGET = js.native
    inline def configGet_=(x: TypeofCONFIGGET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configGet")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.configSet")
    @js.native
    def configSet: TypeofCONFIGSET = js.native
    inline def configSet_=(x: TypeofCONFIGSET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configSet")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.delete")
    @js.native
    def delete: TypeofDELETE = js.native
    inline def delete_=(x: TypeofDELETE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delete")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.explain")
    @js.native
    def explain: TypeofEXPLAIN = js.native
    inline def explain_=(x: TypeofEXPLAIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("explain")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.list")
    @js.native
    def list: TypeofLIST = js.native
    inline def list_=(x: TypeofLIST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("list")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.profile")
    @js.native
    def profile: TypeofPROFILE = js.native
    inline def profile_=(x: TypeofPROFILE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("profile")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.query")
    @js.native
    def query: TypeofQUERY = js.native
    inline def query_=(x: TypeofQUERY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("query")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.roQuery")
    @js.native
    def roQuery: TypeofROQUERY = js.native
    inline def roQuery_=(x: TypeofROQUERY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roQuery")(x.asInstanceOf[js.Any])
    
    @JSImport("@redis/graph", "default.slowLog")
    @js.native
    def slowLog: TypeofSLOWLOG = js.native
    inline def slowLog_=(x: TypeofSLOWLOG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slowLog")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@redis/graph", "Graph")
  @js.native
  open class Graph protected () extends default {
    def this(client: GraphClientType, name: String) = this()
  }
}
