package typings.reactNativeCommunityCameraroll

import typings.reactNativeCommunityCameraroll.mod.AssetType
import typings.reactNativeCommunityCameraroll.mod.GroupType
import typings.reactNativeCommunityCameraroll.mod.Include
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeCommunityCamerarollStrings {
  
  @scala.inline
  def Album: Album = "Album".asInstanceOf[Album]
  
  @scala.inline
  def All: All = "All".asInstanceOf[All]
  
  @scala.inline
  def Event: Event = "Event".asInstanceOf[Event]
  
  @scala.inline
  def Faces: Faces = "Faces".asInstanceOf[Faces]
  
  @scala.inline
  def Library: Library = "Library".asInstanceOf[Library]
  
  @scala.inline
  def PhotoStream: PhotoStream = "PhotoStream".asInstanceOf[PhotoStream]
  
  @scala.inline
  def Photos: Photos = "Photos".asInstanceOf[Photos]
  
  @scala.inline
  def SavedPhotos: SavedPhotos = "SavedPhotos".asInstanceOf[SavedPhotos]
  
  @scala.inline
  def Videos: Videos = "Videos".asInstanceOf[Videos]
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @scala.inline
  def fileSize: fileSize = "fileSize".asInstanceOf[fileSize]
  
  @scala.inline
  def filename: filename = "filename".asInstanceOf[filename]
  
  @scala.inline
  def imageSize: imageSize = "imageSize".asInstanceOf[imageSize]
  
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  
  @scala.inline
  def photo: photo = "photo".asInstanceOf[photo]
  
  @scala.inline
  def playableDuration: playableDuration = "playableDuration".asInstanceOf[playableDuration]
  
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait Album extends GroupType
  
  @js.native
  sealed trait All
    extends AssetType
       with GroupType
  
  @js.native
  sealed trait Event extends GroupType
  
  @js.native
  sealed trait Faces extends GroupType
  
  @js.native
  sealed trait Library extends GroupType
  
  @js.native
  sealed trait PhotoStream extends GroupType
  
  @js.native
  sealed trait Photos extends AssetType
  
  @js.native
  sealed trait SavedPhotos extends GroupType
  
  @js.native
  sealed trait Videos extends AssetType
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait fileSize extends Include
  
  @js.native
  sealed trait filename extends Include
  
  @js.native
  sealed trait imageSize extends Include
  
  @js.native
  sealed trait location extends Include
  
  @js.native
  sealed trait photo extends js.Object
  
  @js.native
  sealed trait playableDuration extends Include
  
  @js.native
  sealed trait video extends js.Object
}
