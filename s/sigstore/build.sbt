organization := "org.scalablytyped"
name := "sigstore"
version := "1.4.0-f98dfa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-534907",
  "org.scalablytyped" %%% "make-fetch-happen" % "10.0-dt-20221126Z-c4f8dd",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "node-fetch" % "3.3.1-0dca8e",
  "org.scalablytyped" %%% "retry" % "0.12-dt-20220426Z-104726",
  "org.scalablytyped" %%% "sigstore__protobuf-specs" % "0.1.0-cc3ef9",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-8aea55",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tuf-js" % "1.1.6-e0fa64",
  "org.scalablytyped" %%% "tufjs__models" % "1.0.4-ad4402")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
