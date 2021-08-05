package typings.reactNativeCommunityCameraroll

import typings.reactNativeCommunityCameraroll.mod.AssetType
import typings.reactNativeCommunityCameraroll.mod.GroupType
import typings.reactNativeCommunityCameraroll.mod.Include
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeCommunityCamerarollStrings {
  
  @js.native
  sealed trait Album
    extends StObject
       with GroupType
  inline def Album: Album = "Album".asInstanceOf[Album]
  
  @js.native
  sealed trait All
    extends StObject
       with AssetType
       with GroupType
  inline def All: All = "All".asInstanceOf[All]
  
  @js.native
  sealed trait Event
    extends StObject
       with GroupType
  inline def Event: Event = "Event".asInstanceOf[Event]
  
  @js.native
  sealed trait Faces
    extends StObject
       with GroupType
  inline def Faces: Faces = "Faces".asInstanceOf[Faces]
  
  @js.native
  sealed trait Library
    extends StObject
       with GroupType
  inline def Library: Library = "Library".asInstanceOf[Library]
  
  @js.native
  sealed trait PhotoStream
    extends StObject
       with GroupType
  inline def PhotoStream: PhotoStream = "PhotoStream".asInstanceOf[PhotoStream]
  
  @js.native
  sealed trait Photos
    extends StObject
       with AssetType
  inline def Photos: Photos = "Photos".asInstanceOf[Photos]
  
  @js.native
  sealed trait SavedPhotos
    extends StObject
       with GroupType
  inline def SavedPhotos: SavedPhotos = "SavedPhotos".asInstanceOf[SavedPhotos]
  
  @js.native
  sealed trait Videos
    extends StObject
       with AssetType
  inline def Videos: Videos = "Videos".asInstanceOf[Videos]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait fileSize
    extends StObject
       with Include
  inline def fileSize: fileSize = "fileSize".asInstanceOf[fileSize]
  
  @js.native
  sealed trait filename
    extends StObject
       with Include
  inline def filename: filename = "filename".asInstanceOf[filename]
  
  @js.native
  sealed trait imageSize
    extends StObject
       with Include
  inline def imageSize: imageSize = "imageSize".asInstanceOf[imageSize]
  
  @js.native
  sealed trait location
    extends StObject
       with Include
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait photo extends StObject
  inline def photo: photo = "photo".asInstanceOf[photo]
  
  @js.native
  sealed trait playableDuration
    extends StObject
       with Include
  inline def playableDuration: playableDuration = "playableDuration".asInstanceOf[playableDuration]
  
  @js.native
  sealed trait video extends StObject
  inline def video: video = "video".asInstanceOf[video]
}
