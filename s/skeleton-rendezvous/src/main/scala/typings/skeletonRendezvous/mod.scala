package typings.skeletonRendezvous

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // eslint-disable-next-line no-redeclare
  @JSImport("skeleton-rendezvous", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SkeletonRendezvousHasher {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var fanout: js.UndefOr[Double] = js.undefined
    
    var hashAlgorithm: js.UndefOr[String] = js.undefined
    
    var minClusterSize: js.UndefOr[Double] = js.undefined
    
    var sites: js.UndefOr[js.Array[String]] = js.undefined
    
    var targetClusterSize: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFanout(value: Double): Self = StObject.set(x, "fanout", value.asInstanceOf[js.Any])
      
      inline def setFanoutUndefined: Self = StObject.set(x, "fanout", js.undefined)
      
      inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
      
      inline def setMinClusterSize(value: Double): Self = StObject.set(x, "minClusterSize", value.asInstanceOf[js.Any])
      
      inline def setMinClusterSizeUndefined: Self = StObject.set(x, "minClusterSize", js.undefined)
      
      inline def setSites(value: js.Array[String]): Self = StObject.set(x, "sites", value.asInstanceOf[js.Any])
      
      inline def setSitesUndefined: Self = StObject.set(x, "sites", js.undefined)
      
      inline def setSitesVarargs(value: String*): Self = StObject.set(x, "sites", js.Array(value*))
      
      inline def setTargetClusterSize(value: Double): Self = StObject.set(x, "targetClusterSize", value.asInstanceOf[js.Any])
      
      inline def setTargetClusterSizeUndefined: Self = StObject.set(x, "targetClusterSize", js.undefined)
    }
  }
  
  // eslint-disable-next-line no-redeclare
  @js.native
  trait SkeletonRendezvousHasher extends StObject {
    
    def addSites(sites: js.Array[String]): Unit = js.native
    
    def findSite(key: String): String = js.native
    
    def getSites(): js.Array[String] = js.native
    
    def hash(key: String): String = js.native
    
    def removeSites(sites: String): Unit = js.native
    def removeSites(sites: js.Array[String]): Unit = js.native
    
    def setSites(sites: js.Array[String]): Unit = js.native
  }
}
