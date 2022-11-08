package typings.ssh2SftpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DirFilterFunction = js.Function2[/* filePath */ String, /* isDirectory */ Boolean, Boolean]

type ListFilterFunction = js.Function1[/* fileInfo */ FileInfo, Boolean]
