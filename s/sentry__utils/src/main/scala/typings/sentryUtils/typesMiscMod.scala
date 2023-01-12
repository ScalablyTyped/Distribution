package typings.sentryUtils

import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesStackframeMod.StackFrame
import typings.sentryUtils.anon.PartialMechanism
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiscMod {
  
  @JSImport("@sentry/utils/types/misc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addContextToFrame(lines: js.Array[String], frame: StackFrame): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContextToFrame")(lines.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addContextToFrame(lines: js.Array[String], frame: StackFrame, linesOfContext: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContextToFrame")(lines.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], linesOfContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addExceptionMechanism(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionMechanism")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addExceptionMechanism(event: Event, newMechanism: PartialMechanism): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionMechanism")(event.asInstanceOf[js.Any], newMechanism.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addExceptionTypeValue(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: Unit, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def arrayify[T](maybeArray: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(maybeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](maybeArray: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(maybeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def checkOrSetAlreadyCaught(exception: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkOrSetAlreadyCaught")(exception.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getEventDescription(event: Event): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventDescription")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseSemver(input: String): SemVer = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSemver")(input.asInstanceOf[js.Any]).asInstanceOf[SemVer]
  
  inline def uuid4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")().asInstanceOf[String]
  
  /**
    * Represents Semantic Versioning object
    */
  trait SemVer extends StObject {
    
    var buildmetadata: js.UndefOr[String] = js.undefined
    
    var major: js.UndefOr[Double] = js.undefined
    
    var minor: js.UndefOr[Double] = js.undefined
    
    var patch: js.UndefOr[Double] = js.undefined
    
    var prerelease: js.UndefOr[String] = js.undefined
  }
  object SemVer {
    
    inline def apply(): SemVer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemVer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemVer] (val x: Self) extends AnyVal {
      
      inline def setBuildmetadata(value: String): Self = StObject.set(x, "buildmetadata", value.asInstanceOf[js.Any])
      
      inline def setBuildmetadataUndefined: Self = StObject.set(x, "buildmetadata", js.undefined)
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
    }
  }
}
