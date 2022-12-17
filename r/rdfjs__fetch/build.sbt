organization := "org.scalablytyped"
name := "rdfjs__fetch"
version := "3.0-dt-20211202Z-3f18df"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rdfjs__fetch-lite" % "3.0-dt-20211202Z-0dcaf3",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "1.0-dt-20211202Z-734fad",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-d396ff",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
