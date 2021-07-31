package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesystem {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of fileSystemSize
      * @returns Number
      */
    var getFileSystemSize: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of fileSystemType
      * @returns Number
      */
    var getFileSystemType: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of readerType
      * @returns String
      */
    var getReaderType: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of stringEncoding
      * @returns String
      */
    var getStringEncoding: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Sets the value of fileSystemSize
      * @param fileSystemSize Number The new value.
      */
    var setFileSystemSize: js.UndefOr[js.Function1[/* fileSystemSize */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of fileSystemType
      * @param fileSystemType Number The new value.
      */
    var setFileSystemType: js.UndefOr[js.Function1[/* fileSystemType */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of readerType
      * @param readerType String The new value.
      */
    var setReaderType: js.UndefOr[js.Function1[/* readerType */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of stringEncoding
      * @param stringEncoding String The new value.
      */
    var setStringEncoding: js.UndefOr[js.Function1[/* stringEncoding */ js.UndefOr[String], Unit]] = js.undefined
  }
  object IAbstract {
    
    @scala.inline
    def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit class IAbstractMutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFileSystemSize(value: () => Double): Self = StObject.set(x, "getFileSystemSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileSystemSizeUndefined: Self = StObject.set(x, "getFileSystemSize", js.undefined)
      
      @scala.inline
      def setGetFileSystemType(value: () => Double): Self = StObject.set(x, "getFileSystemType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileSystemTypeUndefined: Self = StObject.set(x, "getFileSystemType", js.undefined)
      
      @scala.inline
      def setGetReaderType(value: () => String): Self = StObject.set(x, "getReaderType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetReaderTypeUndefined: Self = StObject.set(x, "getReaderType", js.undefined)
      
      @scala.inline
      def setGetStringEncoding(value: () => String): Self = StObject.set(x, "getStringEncoding", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStringEncodingUndefined: Self = StObject.set(x, "getStringEncoding", js.undefined)
      
      @scala.inline
      def setSetFileSystemSize(value: /* fileSystemSize */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setFileSystemSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFileSystemSizeUndefined: Self = StObject.set(x, "setFileSystemSize", js.undefined)
      
      @scala.inline
      def setSetFileSystemType(value: /* fileSystemType */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setFileSystemType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFileSystemTypeUndefined: Self = StObject.set(x, "setFileSystemType", js.undefined)
      
      @scala.inline
      def setSetReaderType(value: /* readerType */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setReaderType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetReaderTypeUndefined: Self = StObject.set(x, "setReaderType", js.undefined)
      
      @scala.inline
      def setSetStringEncoding(value: /* stringEncoding */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setStringEncoding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStringEncodingUndefined: Self = StObject.set(x, "setStringEncoding", js.undefined)
    }
  }
  
  trait IChrome
    extends StObject
       with IHTML5
  object IChrome {
    
    @scala.inline
    def apply(): IChrome = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChrome]
    }
  }
  
  trait ICordova
    extends StObject
       with IHTML5 {
    
    /** [Method] Downloads a file from the server saving it into the Local File System
      * @param config Object
      * @returns FileTransfer
      */
    var download: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], js.Any]] = js.undefined
    
    /** [Method]
      * @param config Object
      */
    var readMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Send a file to a server
      * @param config Object
      * @returns FileTransfer
      */
    var upload: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], js.Any]] = js.undefined
    
    /** [Method]
      * @param config Object
      */
    var writeMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ICordova {
    
    @scala.inline
    def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    @scala.inline
    implicit class ICordovaMutableBuilder[Self <: ICordova] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(value: /* config */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setReadMetadata(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "readMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadMetadataUndefined: Self = StObject.set(x, "readMetadata", js.undefined)
      
      @scala.inline
      def setUpload(value: /* config */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "upload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      
      @scala.inline
      def setWriteMetadata(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "writeMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteMetadataUndefined: Self = StObject.set(x, "writeMetadata", js.undefined)
    }
  }
  
  trait IDirectoryEntry
    extends StObject
       with IEntry {
    
    /** [Method] Works the same way as getFile but creates or looks up a directory
      * @param config Object
      */
    var getDirectory: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Requests a Directory from the Local File System
      * @param config Object
      */
    var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Creates or looks up a file
      * @param config Object The object which contains the following config options:
      */
    var getFile: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Lists all the entries in the directory
      * @param config Object The object which contains the following config options:
      */
    var readEntries: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Works the same way as Ext device filesystem Entry remove but removes the directory and all of its contents if any
      * @param config Object
      */
    var removeRecursively: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IDirectoryEntry {
    
    @scala.inline
    def apply(): IDirectoryEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDirectoryEntry]
    }
    
    @scala.inline
    implicit class IDirectoryEntryMutableBuilder[Self <: IDirectoryEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDirectory(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getDirectory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDirectoryUndefined: Self = StObject.set(x, "getDirectory", js.undefined)
      
      @scala.inline
      def setGetEntry(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getEntry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEntryUndefined: Self = StObject.set(x, "getEntry", js.undefined)
      
      @scala.inline
      def setGetFile(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFileUndefined: Self = StObject.set(x, "getFile", js.undefined)
      
      @scala.inline
      def setReadEntries(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "readEntries", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadEntriesUndefined: Self = StObject.set(x, "readEntries", js.undefined)
      
      @scala.inline
      def setRemoveRecursively(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "removeRecursively", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveRecursivelyUndefined: Self = StObject.set(x, "removeRecursively", js.undefined)
    }
  }
  
  trait IEntry
    extends StObject
       with IBase {
    
    /** [Method] Works the same way as moveTo but copies the entry
      * @param config Object
      */
    var copyTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Returns the file system on which the entry resides
      * @returns Ext.device.filesystem.FileSystem The entry file system.
      */
    var getFileSystem: js.UndefOr[js.Function0[typings.senchaTouch.Ext.device.filesystem.IFileSystem]] = js.undefined
    
    /** [Method] Returns the full absolute path from the root to the entry
      * @returns String The entry full path.
      */
    var getFullPath: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the name of the entry excluding the path leading to it
      * @returns String The entry name.
      */
    var getName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Looks up the parent directory containing the entry
      * @param config Object The object which contains the following config options:
      */
    var getParent: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Returns whether the entry is a directory
      * @returns Boolean The entry is a directory.
      */
    var isDirectory: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns whether the entry is a file
      * @returns Boolean The entry is a file.
      */
    var isFile: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Moves the entry to a different location on the file system
      * @param config Object The object which contains the following config options:
      */
    var moveTo: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Removes the entry from the file system
      * @param config Object The object which contains the following config options:
      */
    var remove: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IEntry {
    
    @scala.inline
    def apply(): IEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEntry]
    }
    
    @scala.inline
    implicit class IEntryMutableBuilder[Self <: IEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyTo(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopyToUndefined: Self = StObject.set(x, "copyTo", js.undefined)
      
      @scala.inline
      def setGetFileSystem(value: () => typings.senchaTouch.Ext.device.filesystem.IFileSystem): Self = StObject.set(x, "getFileSystem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileSystemUndefined: Self = StObject.set(x, "getFileSystem", js.undefined)
      
      @scala.inline
      def setGetFullPath(value: () => String): Self = StObject.set(x, "getFullPath", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFullPathUndefined: Self = StObject.set(x, "getFullPath", js.undefined)
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      @scala.inline
      def setGetParent(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getParent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetParentUndefined: Self = StObject.set(x, "getParent", js.undefined)
      
      @scala.inline
      def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      @scala.inline
      def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
      
      @scala.inline
      def setMoveTo(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoveToUndefined: Self = StObject.set(x, "moveTo", js.undefined)
      
      @scala.inline
      def setRemove(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
  
  trait IFileEntry
    extends StObject
       with IEntry {
    
    /** [Method] Requests a File Handle from the Local File System
      * @param config Object
      */
    var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Returns the byte offset into the file at which the next read write will occur
      * @returns Number The file offset.
      */
    var getOffset: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Reads the data from the file starting at the file offset
      * @param config Object The object which contains the following config options:
      */
    var read: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the byte offset into the file at which the next read write will occur
      * @param config Object The object which contains the following config options:
      */
    var seek: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Truncates or extends the file to the specified size in bytes
      * @param config Object The object which contains the following config options:
      */
    var truncate: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Writes the data to the file starting at the file offset
      * @param config Object The object which contains the following config options:
      */
    var write: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IFileEntry {
    
    @scala.inline
    def apply(): IFileEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileEntry]
    }
    
    @scala.inline
    implicit class IFileEntryMutableBuilder[Self <: IFileEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEntry(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getEntry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEntryUndefined: Self = StObject.set(x, "getEntry", js.undefined)
      
      @scala.inline
      def setGetOffset(value: () => Double): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffsetUndefined: Self = StObject.set(x, "getOffset", js.undefined)
      
      @scala.inline
      def setRead(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setSeek(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSeekUndefined: Self = StObject.set(x, "seek", js.undefined)
      
      @scala.inline
      def setTruncate(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "truncate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setWrite(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  trait IFileSystem
    extends StObject
       with IBase {
    
    /** [Method] Returns a Ext device filesystem DirectoryEntry instance for the root of the file system
      * @returns Ext.device.filesystem.DirectoryEntry The file system root directory.
      */
    var getRoot: js.UndefOr[js.Function0[IDirectoryEntry]] = js.undefined
  }
  object IFileSystem {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.device.filesystem.IFileSystem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.device.filesystem.IFileSystem]
    }
    
    @scala.inline
    implicit class IFileSystemMutableBuilder[Self <: typings.senchaTouch.Ext.device.filesystem.IFileSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetRoot(value: () => IDirectoryEntry): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRootUndefined: Self = StObject.set(x, "getRoot", js.undefined)
    }
  }
  
  trait IHTML5
    extends StObject
       with IAbstract {
    
    /** [Method] Requests a Ext device filesystem FileSystem instance
      * @param config Object The object which contains the following config options:
      */
    var requestFileSystem: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IHTML5 {
    
    @scala.inline
    def apply(): IHTML5 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHTML5]
    }
    
    @scala.inline
    implicit class IHTML5MutableBuilder[Self <: IHTML5] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestFileSystem(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "requestFileSystem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestFileSystemUndefined: Self = StObject.set(x, "requestFileSystem", js.undefined)
    }
  }
  
  trait IPhoneGap
    extends StObject
       with IHTML5 {
    
    /** [Method] Downloads a file from the server saving it into the Local File System
      * @param config Object
      * @returns FileTransfer
      */
    var download: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], js.Any]] = js.undefined
    
    /** [Method]
      * @param config Object
      */
    var readMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Send a file to a server
      * @param config Object
      * @returns FileTransfer
      */
    var upload: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], js.Any]] = js.undefined
    
    /** [Method]
      * @param config Object
      */
    var writeMetadata: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IPhoneGap {
    
    @scala.inline
    def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
    
    @scala.inline
    implicit class IPhoneGapMutableBuilder[Self <: IPhoneGap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(value: /* config */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setReadMetadata(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "readMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadMetadataUndefined: Self = StObject.set(x, "readMetadata", js.undefined)
      
      @scala.inline
      def setUpload(value: /* config */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "upload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      
      @scala.inline
      def setWriteMetadata(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "writeMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteMetadataUndefined: Self = StObject.set(x, "writeMetadata", js.undefined)
    }
  }
  
  trait ISencha
    extends StObject
       with IAbstract {
    
    /** [Method] Requests a Ext device filesystem FileSystem instance
      * @param config Object The object which contains the following config options:
      */
    var requestFileSystem: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ISencha {
    
    @scala.inline
    def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    @scala.inline
    implicit class ISenchaMutableBuilder[Self <: ISencha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestFileSystem(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "requestFileSystem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequestFileSystemUndefined: Self = StObject.set(x, "requestFileSystem", js.undefined)
    }
  }
  
  type ISimulator = IHTML5
}
