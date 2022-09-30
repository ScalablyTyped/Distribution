package typings.snapchatLensStudio.global

import typings.snapchatLensStudio.SnapchatLensStudio.Global
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// // Instead, when `@types/node` is present, please add this shim will be needed to establish the typings `global`:
// declare module NodeJS {
//     interface Global extends SnapchatLensStudio.Global {}
// }
/** Returns the time difference in seconds between the current frame and previous frame. */
inline def getDeltaTime(): Double = js.Dynamic.global.applyDynamic("getDeltaTime")().asInstanceOf[Double]

/** Returns the time in seconds since the lens was started. */
inline def getTime(): Double = js.Dynamic.global.applyDynamic("getTime")().asInstanceOf[Double]

inline def global: Global = js.Dynamic.global.selectDynamic("global").asInstanceOf[Global]

/** Returns true if the passed in object is null or destroyed. Useful as a safe way to check if a SceneObject or Component has been destroyed. */
inline def isNull(reference: js.Object): Boolean = js.Dynamic.global.applyDynamic("isNull")(reference.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Prints out a message to the Logger window. */
inline def print(message: Any): Unit = js.Dynamic.global.applyDynamic("print")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
