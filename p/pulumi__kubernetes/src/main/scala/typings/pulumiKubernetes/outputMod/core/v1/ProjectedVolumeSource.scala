package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a projected volume source
  */
trait ProjectedVolumeSource extends StObject {
  
  /**
    * Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: Double
  
  /**
    * list of volume projections
    */
  var sources: js.Array[VolumeProjection]
}
object ProjectedVolumeSource {
  
  inline def apply(defaultMode: Double, sources: js.Array[VolumeProjection]): ProjectedVolumeSource = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectedVolumeSource]
  }
  
  extension [Self <: ProjectedVolumeSource](x: Self) {
    
    inline def setDefaultMode(value: Double): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    inline def setSources(value: js.Array[VolumeProjection]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: VolumeProjection*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
