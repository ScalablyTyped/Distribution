organization := "org.scalablytyped"
name := "rc-cascader"
version := "3.11.1-e34c3d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "rc-component__trigger" % "1.12.1-52da97",
  "org.scalablytyped" %%% "rc-motion" % "2.7.3-d42550",
  "org.scalablytyped" %%% "rc-select" % "14.4.3-e4dae4",
  "org.scalablytyped" %%% "rc-tree" % "5.7.3-989e80",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.13-528edc",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
